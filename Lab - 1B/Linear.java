import java.util.*;
import java.io.*;
class Linear {
	class LinearBinarySearch {
		public static int LinearSearch(int[] arr, int target){
			int iterations = 0;
			for(int i = 0;i < arr.length;i++){
				if(arr[i] == target){
					iterations = i;
				}
			}
			iterations++;
			if (iterations == 0){
				iterations = -1;
			}
			return iterations;
		}

	
	public static void main(String[] args) {
		
	}
}