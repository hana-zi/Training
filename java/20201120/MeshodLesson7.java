import java.util.*;
public class MeshodLesson7{	
	public static void main(String[] args){
		System.out.print("月を入力してください>");
		int num=new Scanner(System.in).nextInt();
		System.out.println(num +"月の日数は"+getNumber0fDays(num)+"日です。");
	}
	public static int getNumber0fDays(int month){
		int days;
		switch(month){
			case 2:
				days=28;
			case 4:
			case 6:
			case 9:
			case 11:
				days=30;
				break;
			default :
				days=31;
		}
		return days;
	}
}
