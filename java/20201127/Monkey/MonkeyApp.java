import java.util.*;
public class MonkeyApp{
	public static void main(String[] args){
		System.out.print("おさるの名前を決めてください:>");
		String name= new Scanner(System.in).nextLine();
		System.out.print("おさるの歳を決めてください:>");
		int age=new Scanner(System.in).nextInt();
		Monkey m=new Monkey(name,age);
		while(true){
			System.out.print("おさるに何をさせますか？1…挨拶、2…竹馬、3…逆立ち、4…終了>");
			int select=new Scanner(System.in).nextInt();
			switch(select){
				case 1:
					m.greet();
					break;
				case 2:
					m.takeuma();
					break;
				case 3:
					m.sakadachi();
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
