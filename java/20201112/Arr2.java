import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] nums=new int[10];
			//for(int i=0;i<nums.length;i--){
			for(int i=0;i<nums.length/2;i++){
				int temp=nums[i];
					nums[i]=nums[nums.length-1-i];
				  nums[nums.length-1-i]=temp;
				//nums[i]=i+1;
			}
		System.out.println(Arrays.toString(nums));
		//拡張for文で全部出力
		for(int val : nums){
			//System.out.println(val);
			
		}
		for(int i=0
	}
}
