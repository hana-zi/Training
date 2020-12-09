public class Archer {
	private static int totalArcher;
	private int no;
	public Archer(){
	 totalArcher++;	
	 this.no=totalArcher;
	 System.out.println("Archer"+this.no+"‚ğ¶¬‚µ‚Ü‚µ‚½B");
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"‚Í–î‚ğ•ú‚Á‚½I");
	}
	public static int getTotalArcher(){
		return totalArcher;
	}
}