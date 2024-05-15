package Thread4;

public class MyRunnable implements Runnable {
    private Object object;

    public MyRunnable(Object object) {
        this.object = object;
    }

    @Override
    public void run() {
        //Выполняется пока поток не прерван
        while (!Thread.interrupted()) {
            //синхронизация по объекту
            synchronized (object) {
                try {
                    System.out.println(Thread.currentThread().getName());
                    //Уведомление другого потока
                    object.notify();
                    //Ожидание уведомления
                    object.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    Thread.currentThread().interrupt(); //Флаг прерывания потока
                    return; //завершение метода run
                }
            }
        }
    }
}

