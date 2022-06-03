package by.alextech303.Patterns.Singleton;

public class MySingleton {
  private static MySingleton instance;
  String name;
  private MySingleton(String name){
    this.name = name;
  }

  public static MySingleton getInstance(String names){
    if(instance==null){
      instance=new MySingleton(names);

    }return instance;
  }

  @Override
  public String toString() {
    return "MySingleton{" +
        "name='" + name + '\'' +
        '}';
  }
}
