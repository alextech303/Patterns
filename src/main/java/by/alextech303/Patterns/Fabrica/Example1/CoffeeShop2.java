package by.alextech303.Patterns.Fabrica.Example1;

public class CoffeeShop2 {

  private final CoffeeFactory coffeeFactory;

  public CoffeeShop2(CoffeeFactory coffeeFactory){
    this.coffeeFactory = coffeeFactory;
  }


  public Coffee orderCoffee(CoffeeType coffeeType){

    Coffee coffee = coffeeFactory.createCoffee(coffeeType);
    coffee.grindCoffee();
    coffee.makeCoffee();
    System.out.println("Ваш кофе "+coffeeType + " готов");
    return coffee;
  }
}
