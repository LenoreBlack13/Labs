package Lab10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ListOfStrings {

    public static List<String> writeData(String file) {
        List<String> strings = new ArrayList<>(); //Список для хранения строк

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String string;
            //Добавление каждой строки в список strings
            while ((string = reader.readLine()) != null) {
                strings.add(string);
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return strings;
    }

    public static void main(String[] args) {
        List<String> file = writeData("Files/text1.txt");
        //проходим по списку file и каждую строку записывем в string и выводим построчно
        for (String string : file) {
            System.out.println(string);
        }
    }
}
