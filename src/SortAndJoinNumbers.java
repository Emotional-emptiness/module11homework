import java.util.Arrays;
import java.util.stream.Collectors;

public class SortAndJoinNumbers {
    public static String sortAndJoinNumbers(String[] inputArray) {
        return Arrays.stream(inputArray)
                .flatMap(s -> Arrays.stream(s.split(",\\s*")))
                .map(Integer::parseInt)
                .sorted()
                .map(Object::toString)
                .collect(Collectors.joining(", "));
    }
}
