import java.math.*;
import java.util.HashMap;

public class dp_bi {

    public static HashMap<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fibDP(int n) {
        memo.put(0, BigInteger.ZERO);
        memo.put(1, BigInteger.ONE);
        
        BigInteger v;
        for (int i = 2; i < n + 1; i++) {
            //fib[i] = fib[i - 1] + fib[i - 2];
            BigInteger a = memo.get(i - 1);
            //System.out.println("a="+a);
            BigInteger b = memo.get(i - 2);
            //System.out.println("b="+b);
            v = a.add(b);
            //System.out.println("v="+v);
            memo.put(i, v);
        }

    return memo.get(n);
    }

    public static void main(String[] args) {
        // for (int i = 1; i < 10; i++) {
        //     System.out.println("f[" + i + "] =" + fibDP(i));
        // }

        int i = 100000;
        System.out.println("f[" + i + "] = " + fibDP(i));
    }
}

// BigInteger 16,263,054,952,801,281,548
// Long-max    9,223,372,036,854,775,807
// Long.MAX_VALUE