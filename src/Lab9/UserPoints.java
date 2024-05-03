package Lab9;

import java.util.HashMap;
import java.util.Map;

public class UserPoints {
    //Пользователь и его очки
    private Map<User, Integer> userPointsMap;

    //Конструктор класса. Инициализирует Map для хранения данных user
    public UserPoints() {
        this.userPointsMap = new HashMap<>();
    }

    //Метод для добавления пользователя и очков
    public void addUser(User user, int points) {
        userPointsMap.put(user, points);
    }

    //Метод для получения пользователя и очков
    public int getUserPoints(User user) {
        return userPointsMap.getOrDefault(user, 0);
    }
}
