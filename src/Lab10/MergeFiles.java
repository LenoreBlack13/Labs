package Lab10;

import java.io.*;

public class MergeFiles {
    public static void mergeText(String inputFile1, String inputFile2, String outputFile) {
        try {
            //Читает text1
            BufferedReader reader1 = new BufferedReader(new FileReader(inputFile1));
            //Переменная для хранения каждой строки из файла
            String string;

            //Запись text1 в text
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            while ((string = reader1.readLine()) != null) {
                writer.write(string);
                //Метод для разделения строк
                writer.newLine();
            }
            reader1.close();

            //Читает text2
            BufferedReader reader2 = new BufferedReader(new FileReader(inputFile2));

            //Запись text2 в text
            while ((string = reader2.readLine()) != null) {
                writer.write(string);
                //Метод для разделения строк
                writer.newLine();
            }
            reader2.close();

            writer.close();

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        mergeText("Files/text1.txt", "Files/text2.txt", "Files/text.txt");
    }
}
