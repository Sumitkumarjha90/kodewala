package thread;

class Pen {

}

class Book {

}

public class DeadLockDemo {

    public static void main(String[] args) {

        Pen pen = new Pen();
        Book book = new Book();

        Thread t1 = new Thread(() -> {

            synchronized (pen) {

                System.out.println("Thread1 locked Pen");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                synchronized (book) {
                    System.out.println("Thread1 locked Book");
                }
            }
        });

        Thread t2 = new Thread(() -> {

            synchronized (book) {

                System.out.println("Thread2 locked Book");

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                }

                synchronized (pen) {
                    System.out.println("Thread2 locked Pen");
                }
            }
        });

        t1.start();
        t2.start();
    }
}