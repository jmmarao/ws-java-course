package section20.examples.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> integerStream = integerList.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(integerStream.toArray()));
        System.out.println("-------------------\n");

        Stream<String> stringStream = Stream.of("Scarlet Witch", "Black Panther", "Thor", "Doctor Strange");
        System.out.println(Arrays.toString(stringStream.toArray()));
        System.out.println("-------------------\n");

        Stream<Integer> iteratorStream = Stream.iterate(0, x -> x + 2);
        System.out.println(Arrays.toString(iteratorStream.limit(10).toArray()));
        System.out.println("-------------------\n");

        Stream<Long> fibonacciStream = Stream.iterate(new Long[]{0L, 1L}, p -> new Long[]{p[1], p[0] + p[1]}).map(p -> p[0]);
        System.out.println(Arrays.toString(fibonacciStream.limit(20).toArray()));
    }
}
