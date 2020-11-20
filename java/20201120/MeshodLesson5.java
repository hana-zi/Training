import java.util.*;
public class MeshodLesson5{
	public static void main(String[] args){
		System.out.println("言葉>");
		String kotoba=new java.util.Scanner(System.in).next();
		int n=sum0f(3,5);
		System.out.println(n);
	}
	//戻り値のあるメソッド
	static int sum0f(int a,int b){
		return a+b;
	}
	static String kotoba(int a,int b){
		return ("***"+kotoba+"***");
	}
}
