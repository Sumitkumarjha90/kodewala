package thread6;

public class Producer extends Thread {

    Task task;

    public Producer(Task task) {
        this.task = task;
    }

    @Override
    public void run() {

        try {

            for (int i = 1; i <= 5; i++) {

                task.producer(i);

                Thread.sleep(1000);

            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}