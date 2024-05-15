package Thread3;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable {
    private Counter counter;
    private CountDownLatch latch;

    public MyRunnable(Counter counter, CountDownLatch latch) {
        this.counter = counter;
        this.latch = latch;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increment(); //увеличиваем counter на 1
        }
        latch.countDown();//уменьшаем счетчик CountDownLatch, когда кончается поток
    }
}
