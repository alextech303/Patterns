package by.alextech303.Patterns.Facade;

import javax.ejb.Stateless;

@Stateless
public class LoanService {

  public boolean checkCreditRating(long ID, double amount){
    // проверить имеет ли клиент право на даннуу сумму
    return true;
  }

  public boolean getLoan(double amount){
    // проверить дастаточно ли денег в банковском хранилище
    return true;
  }

}
