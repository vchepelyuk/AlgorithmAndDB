import java.util.Arrays;

public class Fibonacci {
    static long[] m;
    public static void main(String[] args) {
        int n = 6;
        m = new long[n + 1];
        System.out.println(fib(n));
    }

    private static long fib(int n) {
        if (n <= 1) {
            return n;
        }
        if (m[n] != 0) {
            return m[n];
        }
        long result = fib(n - 1) + fib(n - 2);
        m[n] = result;
        return result;
    }


    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; // O(n)

        arr[0] = 0; // O(1)
        arr[1] = 1; // O(1)

        for (int i = 2; i <= n; i++) { // O(n)
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n]; // O(1)

        // O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + O(3) = O(2n + 3) = O(n)
    }
}
