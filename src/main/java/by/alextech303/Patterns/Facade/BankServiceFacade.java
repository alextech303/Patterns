package by.alextech303.Patterns.Facade;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class BankServiceFacade {

  @Inject
  AccountService accountService;
  @Inject
  CustomerService customerService;
  @Inject
  LoanService loanService;

  public boolean getLoan(int sessionID, double amount){
    boolean result = false;
    long ID = customerService.getCustomer(sessionID);

if(customerService.checkID(ID)){
  if(loanService.checkCreditRating(ID,amount)){
    result = accountService.setCustomerBalance(ID,amount);
  }
}
return result;
  }




}
