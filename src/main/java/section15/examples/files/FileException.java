package section15.examples.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileException {
    public static void main(String[] args) {
        File file = new File("C:\\temp\\in.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
