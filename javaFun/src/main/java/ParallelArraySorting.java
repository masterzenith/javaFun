import java.util.Arrays;

public class ParallelArraySorting {
	public static void main(String[] args){
		int[] arr = {5,8,1,0,9,2,-3};

		for (int i : arr){
			System.out.println(i+" ");
		}
		Arrays.parallelSort(arr,0,5);
		System.out.println("\nArray elements after sorting");

		for (int i : arr){
			System.out.println(i+ " ");
		}
	}
}
