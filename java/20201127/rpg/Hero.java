public class Hero{
	String name;
	int hp=100;
	
	public Hero(){}
	public Hero(String name){
		this.name=name;
	}
	public Hero(String name,int hp){
		this.name=name;othis(name);
		this.hp=hp;
	}
	public void sleep(){
		this.hp=100;
		System.out.println(this.name+"は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は,"+sec+"秒座った!");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp-=5;
		System.out.println("5のダメージ!");
	}
	public void run(){
		System.out.println(this.name+"は、逃げ出した!");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは"+this.hp+"でした");
	}

}
