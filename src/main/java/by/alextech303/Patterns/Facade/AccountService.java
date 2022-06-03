package by.alextech303.Patterns.Facade;

import javax.ejb.Stateless;

@Stateless
public class AccountService {


  public boolean getLoan(double amount){
    // проверить дастаточно ли денег в банковском хранилище
    return true;
  }


  public boolean setCustomerBalance(long id, double amount){

    //установить новый баланс клиента
    return true;
  }
}
