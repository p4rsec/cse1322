import java.util.*;
import java.lang.Runnable;
class MultiSum{
	public static void main(String[] args) {
		int[] arr = new int[10000];
		Random number = new Random();
		for(int i=0;i<arr.length;i++){
			arr[i] = number.nextInt(1000)+1;
		}
		sumThread PrintSums = new sumThread(arr);
		Thread thread1 = new Thread(PrintSums);
		thread1.start();
	}
}

