package Lab6;

public class Main {
    public static void main(String[] args) {
        //Exercise 4
        SubClass sub = new SubClass(6);
        sub.printNumber();

        //Exercise 5
        SubClassFive subFive = new SubClassFive();
        int age = subFive.getAge();
        String name = subFive.getName();

        System.out.println(String.format("Вас зовут: %s", name));
        System.out.println(String.format("Ваш возраст: %d", age));
    }
}
