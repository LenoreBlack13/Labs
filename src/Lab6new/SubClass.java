package Lab6new;

public class SubClass extends MainClass {

    public SubClass(int number) {
        super(number);
    }

    public void printNumber() {
        System.out.println(String.format("Переменная: %d", number));
    }
}
