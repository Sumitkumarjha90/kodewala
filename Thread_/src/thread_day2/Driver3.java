package thread_day2;

class Mythread5 implements Runnable {

    @Override
    public void run() {

        for (int i = 0; i <= 20; i++) {

            if (i % 2 == 0) {

                try {
                    Thread.sleep(5000); // Pause for 500 milliseconds
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(i + " " + Thread.currentThread().getName());

            } else {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        }
    }
}

public class Driver3 {

    public static void main(String[] args) {

        Mythread5 m1 = new Mythread5();

        Thread t1 = new Thread(m1);
        t1.setName("Thread-1");
        t1.start();

        Thread t2 = new Thread(m1);
        t2.setName("Thread-2");
        t2.start();
    }
}