package by.alextech303.Patterns.Fabrica.RepeatFabrica;

public class Main {

  public static void main(String[] args) {
    CoffeeFabrica coffeeFabrica = new CoffeeFabrica();
    CoffeeShop coffeeShop = new CoffeeShop(coffeeFabrica);

    coffeeShop.orderCoffee(CoffeeType.CAPPUCCINO);

  }

}
