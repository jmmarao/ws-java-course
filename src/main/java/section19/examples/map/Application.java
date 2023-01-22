package section19.examples.map;

import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Doctor Strange");
        cookies.put("email", "strange@email.com");
        cookies.put("phone", "00000-0000");
        cookies.put("phone", "11111-1111");

        cookies.remove("email");

        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
