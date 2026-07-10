package day4;

public class RotateEvenNumb{

    public void rotateEvenNum(int num) {

        int temp = num;
        int count = 0;

        // Count digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 != 0) {
            System.out.println("Number is not even digit");
            return;
        }

        int half = count / 2;
        int rev = 0;

        // Reverse first half
        for (int i = 0; i < half; i++) {
            int last = num % 10;
            rev = rev * 10 + last;
            num = num / 10;
        }
        int result=rev*(int)Math.pow(10,half)+num;
        System.out.println(result);
     
    }

    public static void main(String[] args) {
        RotateEvenNumb obj = new RotateEvenNumb();
        obj.rotateEvenNum(1232);
    }
}