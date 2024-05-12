package Lab10;

import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class StringToFile {
    public static void writeString(String filePath, String str) {
        try {
            //создать объект FileWriter, открывает файл для записи
            FileWriter fileWriter = new FileWriter(filePath);
            //создать объект PrintWriter, принимает fileWriter в качестве параметра для записи данных в файл
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //метод print записывает строки str
            printWriter.print(str);
            //закрыть поток
            printWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String str = "Строка для записи в файл text2.txt";
        writeString("Files/text2.txt", str);
    }
}
