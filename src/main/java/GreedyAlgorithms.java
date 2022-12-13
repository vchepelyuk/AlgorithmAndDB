import java.util.Arrays;
import java.util.Comparator;

public class GreedyAlgorithms {
    public static void main(String[] args) {
        int[] digits = {1,3,7,9,9,5};
        System.out.println(maxDigit(digits));

    }

        public static String maxDigit(int[] digits) {
        return String.join("", Arrays.stream(digits).boxed()
                .sorted(Comparator.reverseOrder())
                .map((integer -> String.valueOf(integer)))
                .toArray(value -> new String[value]));
        }
}
