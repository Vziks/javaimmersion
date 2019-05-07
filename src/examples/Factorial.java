package examples;

import java.math.BigInteger;
import java.util.HashMap;

public class Factorial {
    private static HashMap<Integer, BigInteger> cache = new HashMap<>();

    public static void main(String[] args) {

        final int NUM_FACTS = 100;
        for (int i = 0; i < NUM_FACTS; i++)
            System.out.println(i + "! is " + factorial(i));
        System.out.println(factorial(200));
        System.out.println(factorial(200));
    }

    public static BigInteger factorial(int n) {
        BigInteger ret;
        if (n == 0) return BigInteger.ONE;
        if (null != (ret = cache.get(n))) return ret;
        ret = BigInteger.valueOf(n).multiply(factorial(n - 1));
        cache.put(n, ret);
        return ret;
    }
}
