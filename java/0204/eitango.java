import java.util.*;
public class eitango{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Animal[] animals={
			new Animal("ぞう","elephant"),
			new Animal("しろくま","polarbear"),
			new Animal("くじら","whale"),
			new Animal("ペンギン","penguin"),
			new Animal("カンガルー","kangaroo"),
			new Animal("ライオン","lion"),
			new Animal("ひと","human"),
			new Animal("いぬ","dog"),
			new Animal("ねこ","cat"),
			new Animal("あり","ant"),
		};
		int correct=0;
		for(Animal a : animals){
			System.out.print(a.ja +">>");
			String ans=sc.next();
			if (a.check(ans)){
				correct++;
				System.out.println("正解!");
			}else{
				System.out.println("不正解!"+a.ja+"の英単語は"+a.en);
			}
		}
		System.out.println("全"+animals.length+"問中"+correct+"問正解");
	}
}
class Animal{
	String ja;
	String en;
	Animal(String ja,String en){
		this.ja=ja;
		this.en=en;
	}
	boolean check(String ans){
		return ans.equalsIgnoreCase(this.en);
	}
}
