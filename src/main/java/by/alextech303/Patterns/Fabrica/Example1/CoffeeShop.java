package by.alextech303.Patterns.Fabrica.Example1;

public class CoffeeShop {

  public Coffee orderCoffee(CoffeeType coffeeType) {

    Coffee coffee = null;

    switch (coffeeType) {
      case ESPRESSO:
        coffee = new Espresso();
        break;

      case AMERICANO:
        coffee = new Americano();
        break;

      case CAPPUCCINO:
        coffee = new Cappuccino();
        break;

    }
    coffee.grindCoffee();
    coffee.makeCoffee();
    System.out.println("Ваш кофе "+coffeeType + " готов");
    return coffee;
  }

}
