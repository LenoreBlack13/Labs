import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java");

        calculate();

        double result2 = calculate2();
        System.out.println("Результат выражения (10500/10)/10: " + result2);
        double result3 = calculate3();
        System.out.println("Результат выражения 3,6*4,1*5,9: " + result3);

        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();
        checkNumber(b);

        printNumber();
    }

    public static void calculate(){
        double result1 = (46+10)*(10.0/3);
        result1 = Math.round(result1*100.0)/100.0;
        int result2 = 29*4*(-15);
        System.out.println("Результат выражения (46+10)*(10/3): "+ result1);
        System.out.println("Результат выражения 29*4*(-15): "+ result2);
    }

    public static double calculate2(){
        int number = 10500;
        double result = ((double) number/10)/10;
        return result;
    }

    public static double calculate3(){
        double x = 3.6;
        double y = 4.1;
        double z = 5.9;
        double result = x*y*z;
        return result;
    }

    public static void printNumber(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()){
            int number = scanner.nextInt();
            System.out.println(number);
        }
    }

    public static void checkNumber(int b){
        if (b % 2 != 0){
            System.out.println("Нечетное");
        } else if (b <= 100){
            System.out.println("Четное");
        }   else {
            System.out.println("Выход за пределы диапазона");
        }
    }
}