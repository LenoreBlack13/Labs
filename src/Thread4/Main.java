package Thread4;

public class Main {
    public static void main(String[] args) {
        Object object = new Object();

        Thread thread1 = new Thread(new MyRunnable(object), "Thread-1");
        Thread thread2 = new Thread(new MyRunnable(object), "Thread-2");

        thread1.start();
        thread2.start();
    }
}
