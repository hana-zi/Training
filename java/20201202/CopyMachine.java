import java.util.*;
public class CopyMachine{
	 int paper;
	public CopyMachine(int sheet){
		this.paper=sheet>0 ? sheet:0;
	}
	public void feedPaper(int sheet){
		this.paper+=sheet;
		System.out.printf("%d枚給紙しました。%n",sheet);
	}
	public void copy(int sheet){
		if(this.paper<sheet){
			sheet=this.paper;
		}
		System.out.printf("%d枚コピーしました。%n",sheet);
		this.paper-=sheet;
		}
		public void display(){
			System.out.printf("コピー可能な枚数は%d枚です",this.paper);
		}
}
