package Thread3;
//https://javarush.com/groups/posts/1994-sinkhronizacija-potokov-operator-synchronized
public class Counter {
    int count = 0;

    //Блок может выполняться только одним потоком одновременно
    public synchronized void increment() {
        count = count + 1;
    }

    public int getCount() {
        return count;
    }
}
