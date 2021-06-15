import java.util.concurrent.*;

public class ThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool = (ThreadPoolExecutor) Executors.newFixedThreadPool(10);
        BlockingQueue<Runnable> blockingQueue = new ArrayBlockingQueue<Runnable>(10);
        for (int i = 0; i < 10; i++) {
            String age = String.valueOf((int) Math.random());
            String number = String.valueOf(Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
            blockingQueue.offer(new Task("Avinash", age, number));
        }

        System.out.println("Thread Started");
        while (true) {
            if (blockingQueue.size() > 0) {
                Task task = (Task) blockingQueue.poll();
                threadPool.execute(task);
            } else {
                System.out.println("Queue is Empty");
                try {
                    TimeUnit.SECONDS.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < Math.max((int) Math.random(), 20); i++) {
                    String age = String.valueOf((int) Math.random());
                    String number = String.valueOf(Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L);
                    blockingQueue.offer(new Task("Avinash", age, number));
                }
            }
        }
    }
}