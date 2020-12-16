public class Building{
	public static void main(String[] args){
		System.out.println("建物の幅>");
		int width=new Scanner(System.in).nextInt();
		for(int i=0;i<width;i++){	
			for(int j=0;j<5;j++){
				System.out.println("#");
			}
			System.out.println();
		}
	}
}
