import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FasterFibonacciNth {
    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fib(int n){
        if(n==0 || n==1){
            return BigInteger.ONE;
        }
        if (memo.containsKey(n)){
            return memo.get(n);
        }
        BigInteger v = fib(n-2).add(fib(n-1));
        memo.put(n,v);
        return v;
    }
    public static void main(String[] args){
        int n = 100;
        System.out.println(fib(n));
    }
}
