import java.util.Random;
public class Test1{
	public static void main(String[] args){
		int[] data=new int[5];
		for(int i=0;i<5;i++){
			int num=new Random().nextInt(101);
			data[i]=num;
		}		
		//System.out.println("nums[0]:"+data[0]);
		//System.out.println("nums[1]:"+data[1]);
		//System.out.println("nums[2]:"+data[2]);
		//System.out.println("nums[3]:"+data[3]);
		//System.out.println("nums[4]:"+data[4]);
		for(int i=0;i<data.length;i++){
			System.out.println("nums["+i+"]:"+data[i]);
		}
	}
}
