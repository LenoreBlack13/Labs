package Lab9;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UserPoints userPoints = new UserPoints();

        User user1 = new User("Jane");
        User user2 = new User("Alice");
        User user3 = new User("Zeus");

        Random random = new Random();
        userPoints.addUser(user1, random.nextInt(100));
        userPoints.addUser(user2, random.nextInt(100));
        userPoints.addUser(user3, random.nextInt(100));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input user name: ");
        String userName = scanner.nextLine();

        //Создание нового объекта User, введенного с консоли
        User userInput = new User(userName);

        //Получение очков пользователя
        int userPointsCount = userPoints.getUserPoints(userInput);
        System.out.println(String.format("Count of points the user %s: %d", userName, userPointsCount));

    }
}
