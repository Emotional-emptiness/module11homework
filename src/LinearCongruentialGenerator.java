import java.util.stream.Stream;
public class LinearCongruentialGenerator {
    public static Stream<Long> linearCongruentialGenerator(long a, long c, long m, long seed) {
        return Stream.iterate(seed, n -> (a * n + c) % m)
                .onClose(() -> System.out.println("Stream closed!"));
    }
}
