package by.alextech303.Patterns.Fabrica.RepeatFabrica;

public class Esspresso extends Coffee{

  @Override
  public void pomolCoffee(){
    System.out.println("кофе espresso помолан");
  }

  @Override
  public void prigotovlenieCoffee(){
    System.out.println("приготовление espresso");
  }

}
