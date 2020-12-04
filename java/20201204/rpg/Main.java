public class Main{
	public static void main(String[] args){
		/*SuperHero sh=new SuperHero();
		sh.run();*/
		//Weapon w = new Weapon();
		/*
		Hero h=new Hero();
		Sword sword=new Sword();
		sword.name="はがねの剣";
		sword.damage=10;
		h.setSword(sword);

		PoisonMatango[] ms=new PoisonMatango[3];
		ms[0]=new PoisonMatango('A');
		ms[1]=new PoisonMatango('B');
		ms[2]=new PoisonMatango('C');

		for(PoisonMatango m : ms){
			m.attack(h);
		}
		System.out.println(h.name+"のHP:"+h.hp);
		h.attack(ms[0]);
		*/
		//Character c=new Character();
		//Dancer dancer=new Dancer();
		Goblin goblin=new Goblin();
		Werewolf werewolf=new Werewolf();
		DeathBat deathbat=new DeathBat();
		goblin.attack();
		werewolf.attack();
		deathbat.attack();
		goblin.run();
		deathbat.run();
		werewolf.run();
	}
}
