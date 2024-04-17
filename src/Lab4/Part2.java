package Lab4;

import java.util.Scanner;

public class Part2 {

    //Метод для ввода массива с консоли
    public static int[] inputArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < length; i++ ){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    //Печать массива
    public static void printArray(int[] array){
        System.out.println("Ваш массив: ");
        for (int i = 0; i < array.length; i++){
            if(i == array.length - 1){
                System.out.print(array[i]);
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }
    public static void sortedArray(int[] array){
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++){
            if(array[i] > array[i+1]){
                result = false;
                break;
            }
        }
        if (result){
            System.out.println("OK");
        } else {
            System.out.println("Please, try again");
        }
    }

    public static void changeFirstAndLast(int[] array){
        int num1 = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = num1;
    }

    public static void uniqueNum(int[] array){
        boolean foundUnique = false;
        //Цикл для перебора всех элементов
        for (int i = 0; i < array.length; i++){
            boolean isUnique = true;
            //Вложенный цикл для сравнения текущего элемента с другими
            for (int j = 0; j < array.length; j++){
                //Проверка не сравниваем ли элемент с самим собой И равен ли текущий элемент другому элементу
                if (i !=j && array[i] == array[j]){
                    isUnique = false; //Если есть повторение то не уникальный и завершаем внутренний цикл
                    break;
                }
            }
        if (isUnique){
            System.out.println("Первое уникальное число: " + array[i]);
            foundUnique = true;
            break;
        }
    }
        if (!foundUnique){
            System.out.println("Уникальное число не найдено.");
        }
    }

    public static void main(String[] args){
        int[]array = inputArray(); //Задание 2
        printArray(array); //Задание 2
        sortedArray(array); //Задание 1

        //Задание 3
        System.out.println("Array 1: ");
        printArray(array);
        changeFirstAndLast(array);
        System.out.println("Array 2: ");
        printArray(array);

        //Задание 4
        printArray(array);
        uniqueNum(array);
    }
}
