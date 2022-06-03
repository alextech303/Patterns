package by.alextech303.Patterns.Facade;


import javax.ejb.Stateless;

@Stateless
public class CustomerService {

  public long getCustomer(int sesionID){
    // зарегистрировать индефикатор клиента
    return 100005L;
  }

  public boolean checkID(long x){
    // проверить действителен ли индефикатор клиента
    return true;
  }

}
