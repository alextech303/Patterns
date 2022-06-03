package by.alextech303.Patterns.Fabrica.Example1;

public class CoffeeFactory {

  public Coffee createCoffee(CoffeeType coffeeType) {

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
    return coffee;
  }
}