package test;

import Views.AccountView;
import Views.PersonView;
import Interface.ObservableInterface;
import Interface.ObserverInterface;

/**
 * Created with IntelliJ IDEA.
 * creater: reshadfarid
 * perfected by  :  Bonnie
 * Date: 25-09-13
 * Time: 13:05
 * To change this template use File | Settings | File Templates.
 */

public class Account
{
    float saldo;
    int accountNumber;
    Person person;
    
    public Account(int accountNumber, Person person) 
    {
        this.accountNumber = accountNumber;
        this.person = person;
    }     

    public Person getPerson() {
        return this.person;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void pasSaldoAan(double bedrag) {

        this.saldo += bedrag;

    }	
}
