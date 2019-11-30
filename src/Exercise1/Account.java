package Exercise1;

public class Account {

	private String id;
	private String name;
	private int balance = 0;

	public Account(String id, String name) {
		this.id = id;
		this.name = name;
	}

	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public int getBalance() {
		return this.balance;
	}

	public int credit(int amount) {
		this.balance = this.balance + amount;
		return this.balance;
	}

	public int debit(int amount) {
		if (amount <= this.balance) {
			this.balance = this.balance - amount;
		}

		else {
			System.out.println("\nInsufficient balance!!\n");
		}

		return this.balance;
	}

	public int transferTo(Account another, int amount) {
		if (amount <= this.balance) {
			another.balance += amount;
		}

		else {
			System.out.println("\nInsufficient balance!!\n");
		}

		return another.balance;
	}

	public String toString() {
		StringBuffer s1 = new StringBuffer();
		s1.append("AccountID = ").append(this.id).append("\tName = ").append(this.name).append("\tBalance = ")
				.append(this.balance);
		return s1.toString();
	}

}
