import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		System.out.print("言葉１>");
		String s1=new Scanner(System.in).nextLine();
		System.out.print("言葉2>");
		String s2=new Scanner(System.in).nextLine(); 
		compareLength(s1,s2);
	}
	static void compareLength(String s1,String s2){
		if(s1.length() == s2.length()){
			System.out.println("引き分け");
		}else if(s1.length() > s2.length()){
			System.out.println(s1 + "の勝ち");
		}else{
			System.out.println(s2 + "の勝ち");
		}
	}
}
