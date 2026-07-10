package day4prime;


public class PrintPrime {
    public void printPrime(int count) {

        int num = 2; // start from first prime
        int found = 0;

        while (found < count) {

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
                found++;
            }

            num++;
        }
    }

    public static void main(String[] args) {
        PrintPrime p = new PrintPrime();
        p.printPrime(20); // first 20 prime numbers
    }
}