package Lab6new;

import java.util.Scanner;

public class MainClassFive {
    protected Scanner scanner = new Scanner(System.in);

    public int getAge() {
        System.out.println("Введите Ваш возраст:");
        return scanner.nextInt();
    }
}
