// Seth Beckman
import java.util.Random;

class Blah {
	private static int findLargest(int[] arr){
		int largest = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i] > largest)
				largest = arr[i];	
		}
		return largest;
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
	
	private static int longestCont(int[] data){
		int count = 0;
		int c = 0;
		
		for(int i=0;i<data.length;i++){
			if(data[i]>0){
				c++;
			}
			else if(data[i]<=0){
				c = 0;
			}	
			if(c>0)
				count = c;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] nums = {1, 4, 13, 43, -25, 17, 22, -37, 29};
		int[] data = new int[20];
		data = randData();
		
		System.out.printf("Largest value in 'nums' is %d and largest value in 'data' is %d.\n",findLargest(nums),findLargest(data));
		System.out.printf("The sum of the two largest values is %d\n\n",findLargest(nums)+findLargest(data));
		System.out.println("Values in 'data': ");
		for(int i=0;i<data.length;i++){
			if(i == (data.length - 1))
				System.out.printf("%d\n\n",data[i]);
			else
				System.out.printf("%d, ",data[i]);	
		}
		
		System.out.printf("Length of longest positive series is %d",longestCont(data));
	}
}	