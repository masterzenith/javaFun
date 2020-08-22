public class FibonacciN {
    //fibonacci series using DP

    static int fib(int n){
        int f[]= new int[n+2];  //declare an array to store the Fibonacci numbers
        int i;
        //0th and 1st number of the series set as 0 and 1
        f[0] =0;
        f[1] = 1;
        for(i=2; i<=n; i++){
            f[i] = f[i-1]+f[i-2];
        }
      return f[n];
    }

    public static void main(String[] args){
        int n=9;
        System.out.println(fib(n));
    }
}
