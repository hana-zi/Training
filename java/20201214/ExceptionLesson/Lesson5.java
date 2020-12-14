import java.util.*;
public class Lesson5{
	public static void main(String[] args){
		int[]arr={10,20,30,40};
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("index(q:終了)>");
			String str=sc.next();
			if(str.equalsIgnoreCase("q")){
				System.out.println("終了");
				return;
			}
			try{
				int index=Integer.parseInt(str);
				System.out.println(arr[index]);
			}catch(ArrayIndex0ut0fBoundsException e){
				System.out.println("数値は0~"+arr.length-1);
			}
		}
	}
}
