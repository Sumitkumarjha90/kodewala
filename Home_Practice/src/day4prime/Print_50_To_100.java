package day4prime;

public class Print_50_To_100 {

    public void prime(int start, int end) {

        for (int num = start; num <= end; num++) {

            if (num <= 1) continue;

            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(num);
            }
        }
    }
}

class PrintMain {
    public static void main(String[] args) {
        Print_50_To_100 p = new Print_50_To_100();
        p.prime(50, 100);
    }
}