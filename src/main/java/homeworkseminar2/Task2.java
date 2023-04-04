package homeworkseminar2;

import java.io.FileWriter;
import java.io.IOException;

public class Task2 {
    public static void main(String[] args) {
        String content = generateString();
        writeToFile("test.txt", content);
    }

    public static String generateString() {
        return "TEST ".repeat(100).trim();
         }


    public static void writeToFile(String fileName, String content) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to the file: " + fileName);
        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}
