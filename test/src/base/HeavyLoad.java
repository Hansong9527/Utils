package base;


//构造方法重载
public class HeavyLoad {

	int age;
	String name;
	public HeavyLoad(int age, String name){
		this.age = age;
		this.name = name;
	}
	
	public HeavyLoad(int age){
		this.age = age;
	}
	
	public void speak(){
		System.out.println("im" + name + "and i'm" + age + "years old");
	}
	
	public static void main(String[] arge){
		HeavyLoad h1 = new HeavyLoad(10);
		HeavyLoad h2 = new HeavyLoad(10, "宋鹤");
		h1.speak();
		h2.speak();
	}
}
