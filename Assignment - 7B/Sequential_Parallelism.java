import java.util.*;
import java.time.*;
class Sequential_Parallelism {
	static void bubbleSort(int[] arr) {  
		int n = arr.length;  
		int temp = 0;  
			for(int i=0; i < n; i++){  
				for(int j=1; j < (n-i); j++){  
					if(arr[j-1] > arr[j]){  
						//swap elements  
						temp = arr[j-1];  
						arr[j-1] = arr[j];  
						arr[j] = temp;  
					}
				}
			}
}
	
	public static void main(String[] args) {
		int[] arr1 = new int[10000];
		int[] arr2 = new int[10000];
		Random number = new Random();
		for(int i=0;i<arr1.length;i++){
			arr1[i] = number.nextInt(1000)+1;
		}
		arr2 = arr1;
		
		// bubble sort execution
		long startTime = System.nanoTime();
		bubbleSort(arr1);
		long stopTime = System.nanoTime();
		long totalTime = stopTime - startTime;
		System.out.printf("The execution time for Bubble Sort in seconds: %f\n", (double)totalTime/1_000_000_000.0);
		
		// parallel sort execution
		startTime = System.nanoTime();
		Arrays.parallelSort(arr2);
		stopTime = System.nanoTime();
		totalTime = stopTime - startTime;
		System.out.printf("The execution time for Parallel Sort in seconds: %f", (double)totalTime/1_000_000_000.0);
	}
}