package Lab4;

import java.util.Scanner;

public class Part1 {

    public static void unevenNumbers(){
        for(int i = 1; i<=99; i++){
            if(i % 2 !=0){
                System.out.println(i);
            }
        }
    }

    public static void threefiveDivided(){
        for(int i = 1; i <=100; i++){
            if(i % 3 ==0 && i % 5 ==0){
                System.out.println("Делится на 3 и на 5: " + i);
            }else if (i % 5 ==0){
                System.out.println("Делится на 5: " +i);
            }else if (i % 3 ==0){
                System.out.println("Делится на 3: " +i);
            }
        }
    }

    public static void sumInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = in.nextInt();

        boolean result = (num1 + num2 == num3);
        System.out.println("Результат: " + result);
    }

    public static void compareInt(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.println("Введите третье число: ");
        int num3 = in.nextInt();

        boolean result = (num2 > num1 && num3 > num2);
        System.out.println("Результат: " + result);
    }

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
            }else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void threeFirstOrLast(int[] array){
//        int[] array = {3, -3, 7, 4, 5, 4, 3};
        boolean result = false;
        if (array.length >=2){
            for (int i= 0; i < array.length; i++){
                if (array[i] == 3 && (i == 0 || i == array.length - 1)){
                    result = true;
                    break;
                }
            }
        }
        System.out.println(result);
    }

    public static boolean checkOneOrThree(int[] array){
        boolean result = false;
        for (int i = 0; i < array.length; i++){
            if(array[i] == 3 || array[i] == 1){
                result = true;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        unevenNumbers();
        threefiveDivided();
        sumInt();
        compareInt();
        int[]array = inputArray();
        printArray(array);

        threeFirstOrLast(array);

        boolean result = checkOneOrThree(array);
        System.out.println("Массив содержит число 1 или 3?: " + result);
    }
}
