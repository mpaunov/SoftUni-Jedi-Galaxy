import java.util.Arrays;

public class InputParser {
    public static int[] parseIntegerArray(String input) {
        return Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
