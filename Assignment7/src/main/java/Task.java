import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.TimeUnit;

@Data
@AllArgsConstructor
public class Task implements Runnable {

    private String name;
    private String age;
    private String phoneNo;

    @Override
    public void run() {
        int sleepTime = (int) Math.random();
        System.out.println("Processing Data of: ");
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(name + ' ' + age + ' ' + phoneNo);
                TimeUnit.SECONDS.sleep(3);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
