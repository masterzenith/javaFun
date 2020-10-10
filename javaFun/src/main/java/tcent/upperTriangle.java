package tcent;
/**requirement: b[i] = a[0]*a[1]*....*a[N-1]/a[i] division can't be used.
1. Time Complexity: o(n), space: o(1)
2. except for iterator i, no other variables(including stack temporary variables) are allowed
 http://dl2.iteye.com/upload/attachment/0083/4962/b7b47ca5-114b-3420-9721-173e9c452760.png
*/

public class upperTriangle {
    public static void main(String[] args){
        int N= 5;
        int[] a = new int[] {2,4,6,8,10};
        int[] b = new int[N];
        b[0]=1; // initialize b[0]
        //lower triangle
        for(int i =1; i<= N-1; i++){
            b[i] = b[i-1]*a[i-1];
        }

        //upper triangle
        for(int i = N-2; i>=0; i--){
            b[i] = b[i]*a[i+1];
            a[i] = a[i+1]*a[i];
        }
        System.out.println("The contents of the b array is:");

        for (int i = 0; i<N; i++){
            System.out.println("b[ " + i + "]=" + b[i]);
        }
    }
}
