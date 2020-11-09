public class Lottery{
	public static void main(String[] args){
		int count=3;
		int sum=0;
		for(int i=0;i<count;i++){
			System.out.println(i+1+"¿¿");
			int num = new java.util.Random().nextInt(100)+1;
			System.out.println(num);
			if(num == 1){
				System.out.println("1000¿¿");
				sum += 10000000;
			}else if(num < 4){
				System.out.println("100¿¿");
				sum += 1000000;
			}else if(num < 7){
				System.out.println("10¿¿");
				sum += 100000;
			}else if(num < 11){
				System.out.println("1¿¿");
				sum += 10000;
			}else if(num < 21){
				System.out.println("1000¿");
				sum += 1000;
			}else if(num < 41){
				System.out.println("100¿");
				sum += 100;
			}else{
				System.out.println("¿¿¿");
			}
			System.out.println("¿¿¿¿¿");
			System.out.printf("%,d¿¿¿¿!%n",sum);
		}
	}
}
