package Lab6;

public class SubClassFive extends MainClassFive {
    @Override
    public int getAge() {
        return super.getAge();
    }

    public String getName() {
        System.out.println("Введите Ваше имя:");
        String name = scanner.next();
        return name;
    }
}
