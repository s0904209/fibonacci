import java.math.*;
import java.util.HashMap;
import java.util.Map;

public class BigInteger_HashMap {
    public static BigInteger fibonacci2(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        return fibonacci2(n - 2).add(fibonacci2(n - 1));
    }

    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fibonacci3(int n) {
        if (n == 0 || n == 1) {
            return BigInteger.ONE;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        BigInteger v = fibonacci3(n - 2).add(fibonacci3(n - 1));
        memo.put(n, v);
        return v;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(fibonacci3(i));
        }
    }
}
