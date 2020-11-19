import java.util.*;
public class Test2{
	public static void main(String[] args){
		int[] nums1=new int[5];
		for(int i=0;i<5;i++){
			int ran=new Random().nextInt(100)+1;
			nums1[i]=ran;
		}
		System.out.println("***nums1***");
		for(int i=0;i<5;i++){
			System.out.println(nums1[i]);
		}
		int[] nums2=new int[5];
		for(int i=0;i<5;i++){
			nums2[i]=nums1[i]*3;
		}
		System.out.println("***nums2***");
		for(int i=0;i<5;i++){
			System.out.println(nums2[i]);
		}
	}
}
