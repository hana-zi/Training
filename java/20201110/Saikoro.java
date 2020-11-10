import java.util.Arrays;
import java.util.Random;
public class Saikoro{
	public static void main(String[] args){
		int[]saikoro=new int[10];
		for(int i=0;i<10;i++){
			int dice=new Random().nextInt(6)+1;
			saikoro[i]=dice;

		}
		System.out.println(Arrays.toString(saikoro));
	}
}
