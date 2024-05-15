package Thread3;

import java.util.concurrent.CountDownLatch;

//CountDownLatch предоставляет возможность потокам ожидать завершение определенных операций,
// выполняемых другими потоками, прежде чем переходить к следующему этапу работы.
// Для уменьшения счётчика используется метод countDown(), а для ожидания обнуления счётчика — метод await()

public class Main {
    public static void main(String[] args) {
        int threads = 100;
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(threads);

        //Запуск потоков
        for (int i = 0; i < threads; i++) {
            new Thread(new MyRunnable(counter, latch)).start();
        }

        try {
            latch.await(); //ожидаем обнуление счетчика(завершение всех потоков)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Count: " + counter.getCount());
    }
}

