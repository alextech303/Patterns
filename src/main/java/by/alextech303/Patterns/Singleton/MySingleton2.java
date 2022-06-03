package by.alextech303.Patterns.Singleton;

public class MySingleton2 {

  private volatile MySingleton2 instance;

  private MySingleton2(){

  }

  public MySingleton2 getInstance(){
    if(instance==null){
      synchronized (MySingleton2.class){
        if(instance==null){
          instance = new MySingleton2();
        }
      }
    }return instance;
  }



}
