package Exercise1;

public class TestAccount {

	public static void main(String[] args) {
		Account account = new Account("1","Deepika Mathur");
		
		account.getBalance();
		account.credit(100000);
		account.getBalance();
		account.debit(90000);
		System.out.println(account.toString());
	}

}
