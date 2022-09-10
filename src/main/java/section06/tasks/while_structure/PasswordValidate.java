package section06.tasks.while_structure;

import java.util.Scanner;

public class PasswordValidate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int validPassword = 2002;
        int passwordToCheck = 0;

        while (passwordToCheck != validPassword) {
            System.out.print("Password: ");
            passwordToCheck = scanner.nextInt();

            if (passwordToCheck != validPassword)
                System.out.println("Invalid password");
        }
        System.out.println("Allowed access");

        scanner.close();
    }
}
