package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    Double balance;

    public BankAccount() {

    }


    public void setBalance(Double val) {
        Account account = new Account();
        balance = val;
    }


    @Override
    public void deposit(Double amountToIncreaseBy) {
        balance = balance + amountToIncreaseBy;

    }


    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        balance = balance - amountToDecreaseBy;
    }


    @Override
    public Double getBalance() {
        return balance;
    }

}
