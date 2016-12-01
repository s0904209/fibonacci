import java.math.*;

public class dp {

    public static int fibDP(int x) {
        int fib[] = new int[x + 1];
        fib[0] = 0;
        fib[1] = 1;
	
        for (int i = 2; i < x + 1; i++) {
	        fib[i] = fib[i - 1] + fib[i - 2];
	    }

	return fib[x];
    }

    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            System.out.println("f[" + i + "] =" + fibDP(i));
        }
    }
}


