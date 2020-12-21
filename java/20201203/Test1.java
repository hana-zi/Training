import java.util.*;
public class Overload{
	public static void main(String[] args){
		int[] arr1=createRandomArr(1,9,3);
		System.out.println(Arrays.toString(arr1));
		int[][] arr2=createRandomArr(1,9,3,2);
		for(int[] arr:arr2){
			System.out.println(Arrays.toString(arr));
		}
	}
	static int[] createRandomArr(int min,int max,int len){
		Random rand=new Random();
		int[] arr=new int[len];
		for(int i=0;i<arr.length;i++){
			arr[i]=rand.nextInt(max-min+1)+min;
		}
		return arr;
	}
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			arr[i]=createRandomArr(min,max,childLen);
		}
		return arr;
	}
}
