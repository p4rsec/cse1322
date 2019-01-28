// Seth Beckman

import java.util.*;
class Binary {
	public static int BinarySearch(int[] arr, int target){
		int low=0,high=arr.length,mid=0,index=0;
		boolean found = false;
		Arrays.sort(arr);
		
		while(found == false){
			mid = (low+high)/2;
			if(target == arr[mid]){
				index = mid;
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
		if(found == true)
			return index;
		else
			return -1;	
	}

	private static int[] randData(){
			int[] data = new int[20];
			int n = 0;
			int min = -100; 
			int max = 100;
			long epoch = System.currentTimeMillis();
			Random rand = new Random(epoch);
			for(int i=0;i<20;i++){
				n = rand.nextInt((max - min) + 1) + min;
				data[i] = n;
			}
			
			return data;
		}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 4, 4, 22, -5, 10, 21, -47, 23};
		int[] nums2 = new int[20];
		nums2 = randData();
		
		if(!(BinarySearch(nums1, 21) == -1)){
			System.out.printf("The index for nums1 is %d.\n",BinarySearch(nums1,21));
		}
		else {
			System.out.println("The index was not found.");
		}
		
		if(!(BinarySearch(nums2, 85) == -1)){
			System.out.printf("The index for nums1 is %d.\n",BinarySearch(nums2,85));
		}
		else {
			System.out.println("The index was not found.");
		}
	}
}