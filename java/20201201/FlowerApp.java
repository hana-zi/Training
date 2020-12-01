import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
			System.out.println("何色の花にしますか？>");
		String flowercolor=new Scanner(System.in).nextLine();
		System.out.println("種をいくつ植えますか？");
		int seed=new Scanner(System.in).nextInt();
		Flowerbed flower=new Flowerbed(flowercolor,seed);
		while(true){
		System.out.println("何をしますか？1…水汲み2…水撒き3…花壇を見る4…終了>");
		int action=new Scanner(System.in).nextInt();
		if(action==1){
			flower.drawWater();
		}else if(action==2){
			flower.waterFlower();
		}else if(action==3){
			flower.showStatus();
		}else{
			System.out.println("アプリケーションを終了します");
			break;
		}

	}
	}
}
