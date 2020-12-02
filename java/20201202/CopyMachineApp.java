import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		System.out.println("最初に給紙する枚数を入力してください>");
		int sheet=new Scanner(System.in).nextInt();
		CopyMachine m1=new CopyMachine(sheet);
		while(true){
		System.out.println("1.給紙/2.コピー/3.表示/4.終了>");
		int num=new Scanner(System.in).nextInt();
		switch(num){
			case 1:
				System.out.print("給紙する枚数を入力してください");
				sheet=new Scanner(System.in).nextInt();
				m1.feedPaper(sheet);
				break;
			case 2:
				System.out.print("コピーする枚数を入力してください");
				int copynum=new Scanner(System.in).nextInt();
				m1.copy(copynum);
				break;
			case 3:
				m1.display();
				break;
			case 4:
				System.out.print("アプリケーション終了");
				return;
		}
	}
	}
}
