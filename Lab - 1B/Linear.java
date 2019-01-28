// Seth Beckman

import java.util.*;
class Linear {
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

	private static int LinearSearch(int[] arr, int target){
		int index = -1;
		for(int i = 0;i < arr.length;i++){
			if(arr[i] == target){
				index = i;
				break;
			}
		}
		return index;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1, 4, 4, 22, -5, 10, 21, -47, 23};
		int[] nums2 = new int[20];
		nums2 = randData();
		
		if(!(LinearSearch(nums1, 21) == -1)){
			System.out.printf("The index for nums1 is %d.\n",LinearSearch(nums1,21));
		}
		else {
			System.out.println("The index was not found.");
		}
		
		if(!(LinearSearch(nums2, 85) == -1)){
			System.out.printf("The index for nums1 is %d.\n",LinearSearch(nums2,85));
		}
		else {
			System.out.println("The index was not found.");
		}
	}
}