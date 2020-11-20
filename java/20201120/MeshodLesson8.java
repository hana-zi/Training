import java.util.Scanner;
public class MeshodLesson8 {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("繰り返す文字>");
		String letter=scan.next();
		System.out.print("繰り返す回数>");
		int num=scan.nextInt();
		System.out.println(getStr(letter,num));

	}
	public static String getStr(String letter,int num){
		String str="";
		for(int i=0;i<num;i++){
			str+=letter;
		}
		return str;
	}
}
