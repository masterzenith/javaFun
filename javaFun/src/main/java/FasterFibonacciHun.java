import java.math.BigInteger;

public class FasterFibonacciHun {
    private static BigInteger fib(int n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ZERO;
        BigInteger c = BigInteger.ONE;

        for (int i=1; i<=100; i++){
            a = b;
            b = c;
            c = a.add(b);
        }
        return a;
    }

    public static void main(String[] args){
        System.out.println(fib(1000));
    }
}
