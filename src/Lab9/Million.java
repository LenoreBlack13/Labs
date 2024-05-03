package Lab9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Million {
    //Метод для создания двух списков и добавления в них по 1000000 элементов.
    public static List<Integer>[] addElements() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        System.out.println("Добавление элементов в ArrayList: " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        System.out.println("Добавление элементов в LinkedList: " + (System.currentTimeMillis() - startTime));
        //Возвращаем массив из двух списков, чтобы использовать в след методе
        return new List[]{arrayList, linkedList};
    }

    public static void selectElements(List<Integer> list, int times) {
        Random random = new Random();
        long startTime = System.currentTimeMillis();
        //Цикл для выбора рандомных элементов
        for (int i = 0; i < times; i++) {
            int randomInd = random.nextInt(list.size());
            list.get(randomInd);
        }
        System.out.println("Выбор элементов из списка " + times + " раз заняло " + (System.currentTimeMillis() - startTime));

    }

    public static void main(String[] args) {
        List<Integer>[] lists = addElements();
        List<Integer> arrayList = lists[0];
        List<Integer> linkedList = lists[1];

        selectElements(arrayList, 100000);
        selectElements(linkedList, 100000);
    }
}
