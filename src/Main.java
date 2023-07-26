import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Ivan", "John", "Peter", "Alice", "Michael");
        System.out.println("Завдання 1: " + FormatNames.formatNames(names));


        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        System.out.println("Завдання 2: " + SortAndToUpper.sortAndToUpper(strings));


        String[] inputArray = {"1, 2, 0", "4, 5"};
        System.out.println("Завдання 3: " + SortAndJoinNumbers.sortAndJoinNumbers(inputArray));


        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 12345L;
        Stream<Long> randomStream = LinearCongruentialGenerator.linearCongruentialGenerator(a, c, m, seed);
        System.out.println("Завдання 4: ");
        randomStream.limit(10).forEach(System.out::println);

       
        Stream<String> stream1 = Stream.of("a", "b", "c", "d");
        Stream<String> stream2 = Stream.of("1", "2", "3");
        Stream<String> zippedStream = ShufflesElementsFromStreams.zip(stream1, stream2);
        System.out.println("Завдання 5: ");
        zippedStream.forEach(System.out::println);
    }
}

