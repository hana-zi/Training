import java.util.*;
public class BingoGame{
	public static void main(String[] args) throws Exception{
		//ここを記述
		System.out.println("あなたの名前を入力してください>");
		String name=new Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください>");
		int age=new Scanner(System.in).nextInt();
		System.out.println("こんにちは"+name+"("+age+")さん。");
		System.out.println("18歳未満の方は遊戯できません");
	}
}
class Bingo{
  final int BINGO_RATIO=12;
	String userName;
	int userAge;
	int coin;
	public Bingo(String userName,int userAge,int coin){
		//ここを記述
	}
	public boolean ageCheck(){
	 //ここを記述
	}
	public void play(int bet) throws Exception{
		if(this.coin < bet){
			System.out.println("コインが不足しています");
			return;
		}
		this.coin -= bet;
		Random rand=new Random();
		int[] table=new int[9];
		for(int i=0;i<9;i++){
			/*ここに1秒止める処理を記述*/
			table[i]=rand.nextInt(10);
			System.out.print(table[i]);
			if((i+1) % 3==0){
				System.out.println();
			}
		}
		int bingoCount=bingoCount(table);
		if(bingoCount==0){
			System.out.println("boo");
		}else{
			int win=bet*BINGO_RATIO*bingoCount;
			System.out.println(bingoCount+" LINE BINGO!!win:"+win);
			this.coin += win;
		}
		System.out.printf("%sさんの所持コイン:%d%n",this.userName,this.coin);
	}	
	public int bingoCount(int[] table){
		int[][] bc={
			{0,1,2},{3,4,5},{6,7,8},
			{0,3,6},{1,4,7},{2,5,8},
			{0,4,8},{2,4,6}
		};
		int bingo=0;
		for(int i=0;i<bc.length;i++){
			int[] c= bc[i];
			if(0==1){
				bingo++;
			}
		}
		return bingo;
	}
}
