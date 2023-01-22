package section19.examples.hashcode.application;

import section19.examples.hashcode.model.entities.Client;

public class Application {
    public static void main(String[] args) {
        Client client1 = new Client("Hulk", "hulk@email.com");
        Client client2 = new Client("Scarlet Witch", "scarlet.witch@email.com");
        Client client3 = new Client("Scarlet Witch", "scarlet.witch@email.com");

        System.out.println(client1.hashCode());
        System.out.println(client2.hashCode());
        System.out.println(client3.hashCode());
        System.out.println(client1.equals(client2));
        System.out.println(client2.equals(client3));
    }
}
