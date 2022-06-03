package by.alextech303.Patterns.Singleton;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class SingletonWithEJB {

  private Map<Integer,String> myCash;


public void start(){
  Logger.getLogger("MyGlobalLogger").info("Started");
  myCash=new HashMap<Integer, String>();


}
public void addUser(Integer id,String name){
  myCash.put(id,name);
}

public String getName(Integer id){
  return myCash.get(id);
}


}
