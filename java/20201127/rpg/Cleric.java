public class Cleric{
	String name;
	int hp=50;
	final int MAX_HP=50;
	int mp=10;
	final int MAX=HP=10;
	public void selfAid(){
		this.m-=5;
		this.hp=MAX_HP;
	}
	public int pray(int sec)
		int  temp=new Random().nextInt(3)+sec;
		//int real;
		//if(this.mp + temp > this.MAX_MP){
		//	real=this.MAX_MP-this.mp;
		//}else{
		//	real=temp;

		}
		this.mp+=real;
		return real;
	}
}
