package logic;

public class ManageBankAccount {
	
	public ManageBankAccount() {
		System.out.println("Controller created with success");
	}
	
	public void takeMoney(BankAccount client, Integer quantity) {
		if (client.getMoney() >= quantity) {
			System.out.println("Ok");
			client.takeMoney(quantity);
		}
		else {
			System.out.println("Not enough money");
		}
	}
	
	public void addMoney(BankAccount client, Integer quantity) {
		client.addMoney(quantity);
	}
}