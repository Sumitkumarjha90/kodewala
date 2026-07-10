package inheritance3;

public class Payment1 {

    void doPayment(String accNo, int balance, String note) {

        System.out.println("Payment has been done");
    }
}

class UPI extends Payment1 {

    // Correct main method
    public static void main(String[] args) {

        UPI obj = new UPI();

        // calling overridden method
        obj.doPayment("12345", 5000, "Test payment");
    }

    @Override
    void doPayment(String accNo, int balance, String text) {

        System.out.println("Payment done by UPI");
    }
}

class PaymentSystem {

}