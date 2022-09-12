package section10.examples.list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringList {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Maria");
        stringList.add("Alex");
        stringList.add("Bob");
        stringList.add("Anna");
        stringList.add("Jones");
        stringList.add("Harry");
        stringList.add("Bruno");

        stringList.add(2, "Marco");

        System.out.println("List size (before remove) = " + stringList.size());

        stringList.remove("Anna");
        stringList.remove(1);

        System.out.println("List size (after remove) = " + stringList.size());
        System.out.println("-------------------");

        for (String name : stringList) {
            System.out.println(name);
        }
        System.out.println("-------------------");

//        stringList.removeIf(letter -> letter.charAt(0) == 'M');
        stringList.removeIf(substring -> substring.startsWith("Ma"));
        for (String name : stringList) {
            System.out.println(name);
        }
        System.out.println("-------------------");

        System.out.println("Index of 'Jones': " + stringList.indexOf("Jones"));
        System.out.println("Index of 'name': " + stringList.indexOf("name"));
        System.out.println("-------------------");

        List<String> filterList = stringList.stream().filter(letter -> letter.charAt(0) == 'B').toList();
        for (String name : filterList) {
            System.out.println(name);
        }
        System.out.println("-------------------");

        String nameToFind = stringList.stream().filter(letter -> letter.charAt(0) == 'B').findFirst().orElse(null);

        System.out.println("Find a name with findFirst: " + nameToFind);
    }
}
