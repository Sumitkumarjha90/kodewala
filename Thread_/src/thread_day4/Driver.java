package thread_day4;

class BankAccount {

	private static int balance = 1000;

	public static void withdraw(int amount) {

		synchronized (BankAccount.class) {

			if (balance >= amount) {

				System.out.println(Thread.currentThread().getName() + " is withdrawing" + " " + amount);

				try {
					Thread.sleep(1000);

				} catch (InterruptedException e) {
					e.printStackTrace();

				}
				balance = balance - amount;

				System.out.println(Thread.currentThread().getName() + " completed withdraw " + balance);

			} else {

				System.out.println(Thread.currentThread().getName() + " insufficient balance ");

			}
		}
	}

	public int getBalance() {
		return balance;

	}

}

class Customer extends Thread {

	BankAccount bankAccount;

	public Customer(BankAccount bankAccount) {
		this.bankAccount = bankAccount;

	}

	@Override
	public void run() {

		bankAccount.withdraw(1000);

		
	}

}

public class Driver {

	public static void main(String[] args) {{
		BankAccount bank = new BankAccount();

		Customer c1 = new Customer(bank);

		Customer c2 = new Customer(bank);

		c1.setName("PhonePay");
		c2.setName("Gpay");

		c1.start();
		c2.start();

	}
	}
}
