package by.alextech303.Patterns.Fabrica.RepeatFabrica;

public class Coffee {

  public void pomolCoffee(){
    System.out.println("кофе помолан");
  }


  public void prigotovlenieCoffee(){
    System.out.println("приготовление кофе");
  }

  @Override
  public String toString() {
    return "Coffee{}";
  }
}
