package test;

import java.util.ArrayList;


public class Main 
{
	
	public static void main(String[] args) 
	{
		Person person ;
		Account account;
		ArrayList<Account> list = new ArrayList<Account>();
		ArrayList<String> listStrings = new ArrayList();
		ArrayList<Person> pList = new ArrayList();
		
		
		
		person = new Person(1212, "Bonnie");		
		account = new Account(1213, person);
		
		/*
		 *  A person has an account
		 */
		person.addAccount(account);
		pList.add(person);
		
		/*
		//list.add(account);		
		//listStrings.add("String1");
		person = new Person(2201, "Bonnat");
		account= new Account(2202, person);
		list.add(account);	
		listStrings.add("String2");
		person= new Person(1210, "Reshad");
		account= new Account(1211, person);
		list.add(account);
		listStrings.add("String3");
		
		for(Account ma : list)
		{
			System.out.println("Name: " + ma.getPerson().getName() + "  Scn: " + ma.getPerson().getScn() +
					" and the Accoutnumber " + ma.getAccountNumber());
		}
		
		for(String s : listStrings)
		{
			System.out.println(s);
		}
		
		*/
	}
	
}