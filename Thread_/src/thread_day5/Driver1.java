package thread_day5;

import java.util.concurrent.locks.ReentrantLock;

class BankAccount2 {

    private int balance = 1200;

    ReentrantLock reentrantLock = new ReentrantLock();

    public void withdraw(int amount) {

        System.out.println(Thread.currentThread().getName()
                + " is trying to withdraw...");

        if (reentrantLock.tryLock()) {

            try {

                if (balance >= amount) {

                    System.out.println(Thread.currentThread().getName()
                            + " is withdrawing " + amount);

                    // Simulate processing
                    Thread.sleep(2000);

                    balance -= amount;

                    System.out.println(Thread.currentThread().getName()
                            + " completed withdrawal.");

                    System.out.println("Remaining Balance = " + balance);

                } else {

                    System.out.println(Thread.currentThread().getName()
                            + " : Insufficient Balance");

                }

            } catch (InterruptedException e) {

                e.printStackTrace();

            } finally {

                // Always release the lock
                reentrantLock.unlock();

                System.out.println(Thread.currentThread().getName()
                        + " released the lock.");
            }

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " could not acquire the lock.");

        }

    }

    public int getBalance() {
        return balance;
    }

}

class User extends Thread {

    BankAccount2 bankAccount;

    public User (BankAccount2 bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {

        bankAccount.withdraw(800);

    }
}

public class Driver1
{

    public static void main(String[] args) {

        BankAccount2 account = new BankAccount2();

        User  c1 = new User (account);
        User  c2 = new User (account);

        c1.setName("Sumit");
        c2.setName("Abhi");

        c1.start();
        c2.start();

    }
}