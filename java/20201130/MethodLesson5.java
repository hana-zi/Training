public class MethodLesson5{
	public static void main(String[] args){
		midashiMaker(20,"すごい!!");
		System.out.println("すごいことがありました。");
		midashiMaker(30,"大事件発生しました!");
		System.out.println("大変なことが起こりました。");
		midashiMakerAround(7,"Hello",1);
	}
	static void printLine(int width){
		for(int i=0;i<width;i++){
			System.out.print('*');
		}
		System.out.println();
	}
	static void midashiMaker(int width,String title){
		printLine(width);
		System.out.println('*'+title);
		printLine(width);
	}
	static void midashiMakerAround(String title){
		printLine(title.length()+2);
		System.out.println('*'+title+'*');
		printLine(title.length()+2);
		/*printLine(width);
		System.out.println('*'+title+'*');
		printLine(width);*/
	}

}