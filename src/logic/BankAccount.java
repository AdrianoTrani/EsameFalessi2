package logic;

public class BankAccount {
	private String name;
	private String surname;
	private Integer money;
	
	public BankAccount(String name,String surname){
		this.name = name;
		this.surname = surname;
		this.money = 0;
	}
	
	public Integer getMoney() {
		return this.money;
	}
	
	public void setMoney(Integer money) {
		this.money = money;
	}
	
	public void takeMoney(Integer quantity) {
		this.money = this.money - quantity;
	}
	
	public void addMoney(Integer quantity) {
		this.money = this.money + quantity;
	}
}
