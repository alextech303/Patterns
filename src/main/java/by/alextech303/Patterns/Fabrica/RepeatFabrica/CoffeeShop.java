package by.alextech303.Patterns.Fabrica.RepeatFabrica;


import by.alextech303.Patterns.Fabrica.Example1.CoffeeFactory;

public class CoffeeShop {

  CoffeeFabrica coffeeFabrica;

  public CoffeeShop(CoffeeFabrica coffeeFabrica){
    this.coffeeFabrica=coffeeFabrica;

  }

  public Coffee orderCoffee(CoffeeType coffeeType){

    Coffee coffee = coffeeFabrica.createCoffee(coffeeType);
    coffee.pomolCoffee();
    coffee.prigotovlenieCoffee();
//    return coffee;
    System.out.println("Ваш кофе " +coffeeType+" готов");
    return coffee;
  }


}
