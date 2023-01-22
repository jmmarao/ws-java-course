package section19.examples.set;

import java.util.HashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("TV");
        stringSet.add("Tablet");
        stringSet.add("Notebook");

        System.out.println(stringSet.contains("Notebook"));

        stringSet.removeIf(x -> x.length() >= 3);

        for (String string : stringSet) {
            System.out.println(string);
        }
    }
}
