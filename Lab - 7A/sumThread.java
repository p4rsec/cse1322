import java.util.*;
import java.lang.Runnable;
public class sumThread implements Runnable{
	public int sum;
	public int[] num;
	public sumThread(int[] num){
		this.num = num;
	}
	public void run(){
		for(int i=0;i<num.length;i++){
			sum+=num[i];
		}
		System.out.println(sum);	
	}
}