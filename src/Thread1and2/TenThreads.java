package Thread1and2;

public class TenThreads {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            Thread myRunnable = new Thread(new MyRunnable());
            System.out.println(myRunnable.getName() + " Состояние перед запуском: " + myRunnable.getState() );
            myRunnable.start();
            System.out.println(myRunnable.getName() + " Состояние после запуска: " + myRunnable.getState() );
        }
    }
}
