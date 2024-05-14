package Lab10;

import java.io.*;

public class ReplaceSymbols {
    public static void replaceSymbol(String inputFile, String outputFile) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            int symbol;
            while ((symbol = reader.read()) != -1) {
                if (Character.isLetterOrDigit(symbol)) {
                    writer.write(symbol);
                } else {
                    writer.write('$');
                }
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        replaceSymbol("Files/text4.txt", "Files/text4new.txt");
    }
}
