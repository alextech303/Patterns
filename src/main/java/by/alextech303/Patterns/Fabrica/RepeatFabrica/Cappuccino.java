package by.alextech303.Patterns.Fabrica.RepeatFabrica;

public class Cappuccino extends Coffee{

  @Override
  public void pomolCoffee(){
    System.out.println("кофе cappuccino помолан");
  }

  @Override
  public void prigotovlenieCoffee(){
    System.out.println("приготовление cappuccino");
  }

}
