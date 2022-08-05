package section05.tasks;

import java.util.Scanner;

public class GameDuration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Hour that the game started: ");
        int startedHour = scanner.nextInt();

        System.out.print("Hour that the game ended: ");
        int endedHour = scanner.nextInt();

        int duration = endedHour - startedHour;
        if (startedHour >= endedHour)
            duration += 24;

        System.out.println("The game lasted " + duration + " hours");

        scanner.close();
    }
}
