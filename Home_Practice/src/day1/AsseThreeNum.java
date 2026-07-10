package day1;
public class AsseThreeNum {

    public static void main(String args[]) {

        int num1 = 10;
        int num2 = 30;
        int num3 = 25;

        // Step 1: compare num1 and num2
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // Step 2: compare num1 and num3
        if (num1 > num3) {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        // Step 3: compare num2 and num3
        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Ascending Order:");
        System.out.println(num1 + " " + num2 + " " + num3);
    }
}