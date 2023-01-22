package section19.tasks.election;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        String path = "src/main/java/section19/tasks/election/temp/poll.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            Map<String, Integer> electionPoll = new HashMap<>();

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String nameKey = fields[0];
                Integer pointsValue = Integer.parseInt(fields[1]);

                if (electionPoll.containsKey(nameKey)) {
                    electionPoll.put(nameKey, electionPoll.get(nameKey) + pointsValue);
                } else {
                    electionPoll.put(nameKey, pointsValue);
                }

                line = bufferedReader.readLine();
            }

            for (String candidate : electionPoll.keySet()) {
                System.out.println(candidate + ": " + electionPoll.get(candidate));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
