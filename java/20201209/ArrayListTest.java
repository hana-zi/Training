import java.util.ArrayList.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer>points = new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);
		points.set(3,50);
		int removed=points.set(3,50);//25,10,80,50,90
		System.out.println(points.get(1));//10
		System.out.println(removed);//75
		for (int i : points){
			System.out.println(i);
		}
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		if(points.size() > 2){
		}
		if(points.size() > 0){
		}
		if(points.isEmpty()){
		}
		if(points.contains(90)){
		}
		System.out.println(points.index0f(80));
		System.out.println(points.index0f(1000));
		Integer i1=Integer.value0f(16);
		int i2=i1.intValue();

		String s1=String.value0f(16);
		int i3=Integer.parseInt(s1);
	}
}
