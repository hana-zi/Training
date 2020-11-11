import java.util.*;
public class Test1{
	public static void main(String[] args){
		int[] nums=new int[100];
		int n=new Random().nextInt(100);
		for(int i=77;i=nums;i++){
			System.out.println(Arrays.toString(nums));
			System.out.println("最初の77のindexはnums[i]です");
		}
		else{
		}
	}
}
/*答え
import java.util.*;
public class Arr3{
	public static void main(String[] args){
		int[] nums=new int[100];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(100);
			System.out.print(n+",");
			nums[i]=n;
		}
		System.out.println();
		int target=77;
		int i=0;
		for(;i<nums.length;i++){
			if(nums[i]==target){
				System.out.printf("最初の%dのindexは%dです。%n",target,i);
				break;
			}
		}
		if(i==nums.length){
			System.out.println("77はありませんでした。");
		}
	}
}
