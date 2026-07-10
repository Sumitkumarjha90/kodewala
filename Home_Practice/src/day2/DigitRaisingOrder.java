package day2;
import java.util.Scanner;

public class DigitRaisingOrder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a valid number:");
        int num = sc.nextInt();

        int prevDigit = 10; // bigger than any digit (0–9)
        boolean isRaising = true;

        while (num > 0) {

            int currentDigit = num % 10;

            if (currentDigit > prevDigit) {
                isRaising = false;
                break;
            }

            prevDigit = currentDigit;
            num = num / 10;
        }

        if (isRaising) {
            System.out.println("Number is raising");
        } else {
            System.out.println("Number is not raising");
        }
    }
}