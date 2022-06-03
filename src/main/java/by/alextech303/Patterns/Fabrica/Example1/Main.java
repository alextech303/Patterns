package by.alextech303.Patterns.Fabrica.Example1;

public class Main {

  public static void main(String[] args) {


CoffeeShop coffeeShop = new CoffeeShop();

coffeeShop.orderCoffee(CoffeeType.ESPRESSO);

    System.out.println("________________");
    System.out.println("");


CoffeeShop2 coffeeShop2 = new CoffeeShop2(new CoffeeFactory());

coffeeShop2.orderCoffee(CoffeeType.ESPRESSO);

  }

}
