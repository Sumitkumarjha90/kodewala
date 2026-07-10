package thread6;

public class Consumer extends Thread {

    Task task;

    public Consumer(Task task) {
        this.task = task;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                task.consume();

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}