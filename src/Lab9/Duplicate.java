package Lab9;

import java.util.*;

public class Duplicate {

    public static <T> List<T> deleteDuplicate(List<T> list) {
//        Set<T> set = new HashSet<>(list); //Создается HashSet для хранения уникальных элементов
//        return new ArrayList<>(set); //Преобразуется обратно в ArrayList
        return new ArrayList<>(new LinkedHashSet<>(list)); //Возвращает в изначальном порядке но без дубликатов
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 3, 5, 5, 6, 4, 2, 3, 7);
        List<Integer> unique = deleteDuplicate(new ArrayList<>(numbers));
        System.out.println(unique);
    }
}

