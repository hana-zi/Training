public class Archer {
	private static int totalArcher;
	private int no;
	public Archer(){
	 totalArcher++;	
	 this.no=totalArcher;
	 System.out.println("Archer"+this.no+"�𐶐����܂����B");
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"�͖��������I");
	}
	public static int getTotalArcher(){
		return totalArcher;
	}
}