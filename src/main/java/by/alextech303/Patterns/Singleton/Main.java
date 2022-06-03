package by.alextech303.Patterns.Singleton;

import static by.alextech303.Patterns.Singleton.MySingleton.getInstance;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

//    System.out.println(getInstance("first"));
//    System.out.println(getInstance("second"));
//    System.out.println(getInstance("third"));
//
//
//    //Применим рифлексию
//
//    Class mySingletonClass = MySingleton.class;
//
//Constructor constructor = MySingleton.class.getDeclaredConstructor(String.class);
//constructor.setAccessible(true);
//
//MySingleton mySingleton = (MySingleton) constructor.newInstance("second");
//    System.out.println("После применения рефлексии:");
//    System.out.println(mySingleton);
//
//
//MySingletonEnum mySingletonEnum= MySingletonEnum.INSTANCE;
//
//    mySingletonEnum.doSomethingInteresting();
//
//    MySingletonEnum mySingletonEnum2 = MySingletonEnum.INSTANCE;
//    mySingletonEnum2.doSomethingInteresting();


//    SingletonWithEJB singletonWithEJB = new SingletonWithEJB();
//    singletonWithEJB.addUser(1,"alex");
  }

}
