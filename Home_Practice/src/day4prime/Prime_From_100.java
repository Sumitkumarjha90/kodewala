package day4prime;

public class Prime_From_100 {
    public void primeFrom_100(int count) {

        int num = 100;
        int found = 0;

        while (found < count) {

            boolean isPrime = true;

            if (num <= 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            if (isPrime) {
                System.out.println(num);
                found++;   // ✅ increment only when prime found
            }

            num++;   // ✅ move to next number
        }
    }
}

class Driver5 {
    public static void main(String args[]) {
        Prime_From_100 p = new Prime_From_100();
        p.primeFrom_100(20);
    }
}