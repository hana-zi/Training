import java.util.*;
public class Test2{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(10);
			System.out.print(n+",");	
			nums[i]=n;
		}
		System.out.println();
		String[] strs=new String[10];
		double[] t=new double[10];
		for(int i=0;i<nums.length;i++){
    	strs[i]=nums[i]%2==0 ? "偶数":"奇数";
		}
		
		System.out.println(Arrays.toString(strs));
	}
}
