public class FibonacciHun {
    public static void main(String[] args){
        int n, a =0, b=0, c=1;
        System.out.println("Fibonacci Series for 1st 100: ");

        for (int i=1; i<=100; i++){
            a = b;
            b = c;
            c = a+b;
            System.out.print(a+" ");
        }
    }
}
