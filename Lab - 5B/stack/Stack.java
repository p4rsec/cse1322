package stack;
	import java.util.*;
	class clothes{
		public String name;
		public String color;
		public boolean canW;
		public clothes(String name,String color, boolean canW){
			this.name = name;
			this.color = color;
			this.canW = canW;
			}
		}
	class MyStack
	{
		private int count = 0;
		private int max = 20;
		private clothes[] myClothes;
		public MyStack(){
			myClothes = new clothes[max];
		}
		public int getCount(){
			return count;
		}
		public void push(clothes c)
		{
			myClothes[count] = c;
			count++;
		}
		public clothes pop()
		{
			int pos = count - 1;
			clothes temp = myClothes[pos];
			count--;
			return temp;
		}
		public clothes peek(){
			return myClothes[count - 1];
		}
		}
	class Test{
		public static void main(String[] args){
			clothes myClo = new clothes("pants", "blue", false);
			clothes myClo1 = new clothes("pants", "blue", true);
			clothes myClo2 = new clothes("pants", "red", false);
			clothes myClo3 = new clothes("pants", "blue", false);
			MyStack msta = new MyStack();
			msta.push(myClo);
			msta.push(myClo1);
			msta.push(myClo2);
			msta.push(myClo3);
			clothes[] myclot1= getObjCol(msta, "blue");
			for(int i = 0; i< 3; i++){
				clothes j = myclot1[i];
				System.out.println(j.color);
	//System.out.println(msta.getCount());
			}

		}
	public static clothes[] getObjCol(MyStack s, String color){
		int count = s.getCount();
		clothes[] myc = new clothes[20];
		clothes[] myClothesSave = new clothes[20];
		int clothesCount = 0;

		for(int i = 0; i<count; i++){
			clothes temp = s.pop();
			if(temp.color == color){
				myc[clothesCount] = temp;
				clothesCount++;
			}
			myClothesSave[i] = temp;
		}
		for(int j = myClothesSave.length-1; j>=0; j--){
			s.push(myClothesSave[j]);
		}
		return myc;
	}
}