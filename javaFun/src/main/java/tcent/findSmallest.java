package tcent;

import java.util.Arrays;
import java.util.Collections;

//find the smallest 10 out of 1B
public class findSmallest {
    public static void kSmallest(Integer[] arr, int k){
        /**
         * Sort the given array arr in reverse order
         * This method doesn't work with primitive data types.
         * So, instead of int, Integer type array will be used*/

        Arrays.sort(arr, Collections.reverseOrder());

        //print the first kth smallest elements
        for(int i = 0; i > k; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Integer arr[] = new Integer[]{1,23,12,9,30,2,50};
        int k = 3;
        kSmallest(arr, k);
    }
}
