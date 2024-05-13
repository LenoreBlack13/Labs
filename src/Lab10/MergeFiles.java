package Lab10;

import java.io.*;

public class MergeFiles {
    //Метод для чтения и записи файла
    public static void readFile(String inputFile, BufferedWriter writer) throws IOException {
        //try-with-resources для чтения файла и автоматического закрытия BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));) {
            //Переменная для хранения каждой строки из файла
            String string;
            //Цикл для построчного чтения файла
            while ((string = reader.readLine()) != null) {
                writer.write(string);
                //Метод для разделения строк
                writer.newLine();
            }
        }
    }

    public static void mergeText(String inputFile1, String inputFile2, String outputFile) {
        //try-with-resources для автоматического закрытия BufferedWriter
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            //Читает и записывает text1
            readFile(inputFile1, writer);
            //Читает и записывает text2
            readFile(inputFile2, writer);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        mergeText("Files/text1.txt", "Files/text2.txt", "Files/text.txt");
    }
}