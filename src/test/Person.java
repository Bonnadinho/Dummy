package test;

import java.util.ArrayList;
/**
 * Created with IntelliJ IDEA.
 * creater: reshadfarid
 * perfected by  :  Bonnie
 * Date: 25-09-13
 * Time: 12:58
 * To change this template use File | Settings | File Templates.
 */


public class Person 
{
    int scn;
    String name;
    ArrayList<Account> accountList; 
   

    public Person(int scn, String name) {
        this.scn = scn;
        this.name = name;       
    }

    public String toString() {
        return this.name;
    }

    public void addAccount(Account account) 
    {
        accountList.add(account);
    }

    public void removeAccount(Account account) 
    {
        accountList.remove(account);
    }

    public ArrayList<Account> getAccounts() 
    {
        return accountList;
    }

    public int getScn() {
        return this.scn;
    }

    public String getName() {
        return this.name;
    }
    
}
    
    
