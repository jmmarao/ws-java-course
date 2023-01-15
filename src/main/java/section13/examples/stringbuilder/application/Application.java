package section13.examples.stringbuilder.application;

import section13.examples.stringbuilder.entities.Comment;
import section13.examples.stringbuilder.entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Application {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment comment1 = new Comment("Have a nice trip");
        Comment comment2 = new Comment("Wow that's awesome!");

        Post post1 = new Post(
                simpleDateFormat.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful contruy!",
                12);
        post1.addComment(comment1);
        post1.addComment(comment2);

        System.out.println(post1);

        Comment comment3 = new Comment("Good night");
        Comment comment4 = new Comment("May the force be with you");

        Post post2 = new Post(
                simpleDateFormat.parse("28/07/2018 23:14:19"),
                "Good night guys",
                "See you tomorrow",
                5);
        post2.addComment(comment3);
        post2.addComment(comment4);

        System.out.println(post2);
    }
}
