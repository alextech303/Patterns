package by.alextech303.Patterns.Fabrica.RepeatFabrica;

public class Americano extends Coffee{

  @Override
  public void pomolCoffee(){
    System.out.println("кофе americano помолан");
  }

  @Override
  public void prigotovlenieCoffee(){
    System.out.println("приготовление americano");
  }

}
