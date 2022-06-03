package by.alextech303.Patterns.Fabrica.RepeatFabrica;


public class CoffeeFabrica {


  public Coffee createCoffee(CoffeeType coffeeType) {

    switch (coffeeType) {
      default:
      case AMERICANO:
        new Americano();
      case ESSPRESSO:
        return new Esspresso();

      case CAPPUCCINO:
        return new Cappuccino();
    }
  }

}
