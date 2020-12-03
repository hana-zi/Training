public class SuperHero extends Hero{
	//String name = "ミナト";
	//int hp = 100;
	boolean flying;
	public SuperHero(){
		System.out.println("SuperHeroコンストラクタ");
	}
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃!");
		m.hp -= 5;
		System.out.println("5ポイントのダメージをあたえた!");
	}
	/*public void run(){
		System.out.println(this.name+"は逃げ出した!");
	}*/
	@Override
	public void run(){
		System.out.println(this.name+"は撤退した");
	}
	@Override
	public void attack(Matango m){
		super.attack(m);
		if(this.flying){
			super.attack(m);
		}
	}
}
