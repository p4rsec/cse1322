import java.util.*;
import java.io.*;
class Binary {
	public static int BinarySearch(int[] arr, int target){
		int low=0,high=arr.length,mid=0,iterations=0;
		boolean found = false;
		Arrays.sort(arr);
		
		while(found == false){
			iterations++;
			mid = (low+high)/2;
			if(target == arr[mid]){
				found = true;
			}
			else if(target<arr[mid]){
				high = mid;
			}
			else {
				low = mid;
			}
			if(low>high-1 || high<low+1)
				found = false;
		}
		iterations++;
		if(found == true)
			return iterations;
		else
			return -1;	
	}

	
	public static void main(String[] args) {
		
	}
}