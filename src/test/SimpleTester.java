package test;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import logic.BankAccount;
import logic.ManageBankAccount;

public class SimpleTester {
	public SimpleTester() {
		System.out.println("Simple Tester");
	}
	
	//esegui operazioni fino a trovarti con 100 euro nel conto
	@Test
	public void ManageBankAccount01() {
		//variabili di controllo
		Integer expectedMoney = 100;
		Integer actualMoney;
		
		
		BankAccount account01 = new BankAccount("Gino","Purple");
		ManageBankAccount controller = new ManageBankAccount();
		
		controller.addMoney(account01, 39);
		controller.takeMoney(account01, 9);
		controller.addMoney(account01, 70);
		
		actualMoney = account01.getMoney();
		
		//controllo
		assertEquals(expectedMoney, actualMoney);
		
	}
	
	//tenta di prelevare piu' di quanto si possiede
	@Test
	public void ManageBankAccount02() {
		//variabili di controllo
		Integer expectedMoney = 27;
		Integer actualMoney;
		
		
		BankAccount account02 = new BankAccount("Albert","Indigo");
		ManageBankAccount controller = new ManageBankAccount();
		
		account02.setMoney(10);
		controller.addMoney(account02, 10);
		controller.takeMoney(account02, 1000);
		controller.addMoney(account02, 7);
		
		actualMoney = account02.getMoney();
		
		//controllo
		assertEquals(expectedMoney, actualMoney);
		
	}
}