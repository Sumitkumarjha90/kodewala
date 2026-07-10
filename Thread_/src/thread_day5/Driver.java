package thread_day5;

import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
	
	private int balance = 1000;
	
	ReentrantLock reentrantLock=new ReentrantLock();
	
    
	public void withdraw(int amount) {

		 System.out.println(" The withdraw is processing by "+Thread.currentThread().getName());
		 
		 reentrantLock.lock();

			if (balance >= amount) {

				System.out.println(Thread.currentThread().getName() + " Withdraw " + amount);
				
				try {
					
					Thread.sleep(1000);
					
				} 
				catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				balance = balance - amount;
				
				System.out.println(Thread.currentThread().getName() + " completed withdraw " + balance);

			} else {
				System.out.println(Thread.currentThread().getName() + " Insufficient balance ");
			}
			
			reentrantLock.unlock();
		

	}

	public int getBalance() {
		return balance;

	}

}

class Customer extends Thread {

	BankAccount bank;

	public Customer(BankAccount _bank) {
		this.bank = _bank;

	}

	@Override
	public void run() {
		bank.withdraw(800);

	}
}

public class Driver {

	public static void main(String[] args) {
		BankAccount bank = new BankAccount();

		Customer c1 = new Customer(bank);
		Customer c2 = new Customer(bank);

		c1.setName("Sumit");
		c2.setName("Abhi");
		
		c1.start();
		c2.start();

	}

}
