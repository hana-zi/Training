public class Monkey {
	/****フィールド変数****/
		//名前
		String name;
		//年齢
		int age;
	/****コンストラクタ****/
		//名前と年齢を受け取るコンストラクタ
		public Monkey(String name,int age){
			this.name=name;
			this.age=age;
		}
	/****メソッド****/
	//挨拶をするメソッド
	public void greet(){
		System.out.println("こんにちは["+this.name+"](["+this.age+"]才)です。よろしく!");
		//例)こんにちは[名前]([年齢]才)です。よろしく！
	}
	//竹馬をするメソッド
	public void takeuma(){
		System.out.println("["+this.name+"]は上手に竹馬にのった！");
		//例)[名前]は上手に竹馬にのった！
	}
	//逆立ちをするメソッド
	public void sakadachi(){
		System.out.println("["+this.name+"]はひょいと逆立ちをした!");
		//例)[名前]はひょいと逆立ちをした！
	}
}
