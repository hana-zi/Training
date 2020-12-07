public class Dog{
	public static int count=0;
	private int id;
	private String name;
	private double weight;
	private int age;
	public Dog(String name){
		this.setName(name);
		count++;
		this.setId(count);
	}
	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}
	public Dog(String name,double weight,int age){
		this(name,age);
		this.setWeight(weight);
	}
	public String getName(){
		return this.name;
	}
	public int getId(){
		return this.id
	}
	public void setId(int id){
		this.id=id;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setAge(int age){
		if(age<0){
			this.age=0;
		}else{
			this.age=age;
		}
	}
	public void setWeight(double weight){
		if(weight < 0){
			this.weight=0d;
		}else{

			Dog d3=new Dog("George",3,7000d);
			this.weight=weight;
		}
	}
}
