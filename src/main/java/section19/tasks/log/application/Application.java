package section19.tasks.log.application;

import section19.tasks.log.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/section19/tasks/log/temp/loginfo.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Set<LogEntry> logEntrySet = new HashSet<>();
            String line = bufferedReader.readLine();

            while (line != null) {
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                logEntrySet.add(new LogEntry(username, moment));

                line = bufferedReader.readLine();
            }
            System.out.println("Total users: " + logEntrySet.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
