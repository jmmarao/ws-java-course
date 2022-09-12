package section10.examples.foreach;

public class ForEachVector {
    public static void main(String[] args) {
        String[] vector = new String[]{"Maria", "Bob", "Alex"};

        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        System.out.println("-------------------\n");

        for (String name : vector) {
            System.out.println(name);
        }
    }
}
