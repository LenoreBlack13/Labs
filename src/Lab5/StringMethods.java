package Lab5;

import java.util.Scanner;

public class StringMethods {

    public static String longestString(String text) {
        String[] words = text.split("[ .]+");//Разбивает строку по пробелам и точкам
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static boolean palindromMethod(String word) {
        StringBuilder wordBuilder = new StringBuilder(word);
        wordBuilder.reverse();
        String reverseWord = wordBuilder.toString();
        boolean isPalindrom = word.equalsIgnoreCase(reverseWord); //сравнение без учета регистра
        return isPalindrom;
    }

    public static String inputWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слово: ");
        String word = scanner.next();
        return word;
    }

    public static String censorWord(String text) {
        String censorText = text.replaceAll("бяка", "[вырезано цензурой]");
        return censorText;
    }

    public static int countOfCharsInside(String string1, String string2) {
        int count = 0;
        for (int i = 0; (i = string1.indexOf(string2, i)) != -1; i += string2.length()) {
            count++;
        }
        return count;
    }

    public static String reverseString(String input) {
        String[] words = input.split(" "); //Разбить строку на слова по пробелам
        StringBuilder reverseString = new StringBuilder();

        for (String word : words) { //Итерация по массиву слов из исходной строки
            StringBuilder reserveWord = new StringBuilder(word).reverse(); //Новый объект содержащий слово (word) и reverse
            reverseString.append(reserveWord).append(" "); //Добавить перевернутое слово к объекту reverseString + пробел
        }
        return reverseString.toString();
    }

    public static void main(String[] args) {
//        Exercise 1
        String text = "Ut odio dolores rem voluptate quod non optio tenetur ea Quis nostrum et aspernatur. sapiente ut itaque delectus. In magni eaque nam optio aperiam a temporibus fugit.";
        String longestWord = longestString(text);
        System.out.println(String.format("Самое длинное слово в тексте:%s", longestWord));

//        Exercise 2
        String word = inputWord();
        if (palindromMethod(word)) {
            System.out.println(String.format("Слово \"%s\" является палиндромом", word));
        } else {
            System.out.println(String.format("Слово \"%s\" не является палиндромом", word));
        }

        //Exercise 3
        String origText = "Зацензурить слово бяка";
        String censorText = censorWord(origText);
        System.out.println(origText);
        System.out.println(censorText);

//        Exercise 4
        String string1 = "Alice is a cat";
        String string2 = "Al";

        int count = countOfCharsInside(string1, string2);
        System.out.println(String.format("Количество раз строка %s входит в строку %s: %d", string2, string1, count));

//        Exercise 5
        String input = "This is a test string";
        System.out.println(String.format("The given string is: %s", input));
        String reverseString = reverseString(input);
        System.out.println(String.format("The string reversed word by word is: %s", reverseString));
    }
}
