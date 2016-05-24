public class BankAccountTester {


	public static final void main(String[] args) {

		BankAccount x = new SavingsAccount();
		System.out.println(x.getBalance());

		x.withdraw(2000);
		System.out.println(x.getBalance());

	}


}
