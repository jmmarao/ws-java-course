package section17.examples;

import java.io.File;
import java.util.Scanner;

public class FolderApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a folder path: ");
        String stringPath = scanner.nextLine();

        scanner.close();

        File path = new File(stringPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS:");
        for (File folder : folders) {
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("\nFILES:");
        for (File file : files) {
            System.out.println(file);
        }

        boolean success = new File(stringPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + success);
    }
}
