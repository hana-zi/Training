public class Yotei{
	public static void main(String[] args){
		System.out.println("予定を確認したい曜日を入力してください");
		System.out.println("例：月曜日");
		String name=new java.util.Scanner(System.in).nextLine();
		if(name.equals("月曜日")){
			System.out.println("学校");
		}
		if(name.equals("火曜日")){
		//if("火曜日" == "name"){
			System.out.println("学校");
		}
		if(name.equals("水曜日")){
		//if("水曜日" == "name"){
			System.out.println("学校");
		}
		if(name.equals("木曜日")){
		//if("木曜日" == "name"){
			System.out.println("ハローワｰｸ");
		}
		if(name.equals("金曜日")){
		//if("金曜日" == "name"){
			System.out.println("学校です");
		}
		if(name.equals("土曜日")){
		//if("土曜日" == "name"){
			System.out.println("映画");
		}
		if(name.equals("日曜日")){
		//if("日曜日" == "name"){
			System.out.println("未定");
		}
	}
}
