package Lab10;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StringToFile {
    public static void writeString(String filePath, String str) {
        //создать объект PrintWriter, принимает fileWriter в качестве параметра для записи данных в файл
        //создать объект FileWriter, открывает файл для записи
        //try-with-resources автоматически закроет потоки
        try (FileWriter fileWriter = new FileWriter(filePath);
             PrintWriter printWriter = new PrintWriter(fileWriter))
        {
            printWriter.print(str); //метод print записывает строки str
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String str = "Строка для записи в файл .....text2.txt";
        writeString("Files/text2.txt", str);
    }
}
