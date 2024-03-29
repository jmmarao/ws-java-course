package section20.examples.pipeline;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> integerStream = integerList.stream().map(x -> x * 10);

        System.out.println(Arrays.toString(integerStream.toArray()));
        System.out.println("-------------------\n");

        int sum = integerList.stream().reduce(0, (x, y) -> x + y);
        System.out.println("Sum = " + sum);
        System.out.println("-------------------\n");

        List<Integer> newIntegerList = integerList.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());
        System.out.println(Arrays.toString(newIntegerList.toArray()));
    }
}
