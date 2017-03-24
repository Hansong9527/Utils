package base;

//成员内部类示例
public class Outer {

	private String name = "show";
	
	public void speak(){
		System.out.println("调用成员内部类");
		Introduce in = new Introduce();
		in.show();
	}
	
	class Introduce{
		void show(){
			System.out.println("这是成员内部类的方法:" + name);
		}
	}
	
	public static void main(String[] args){
		Outer outer = new Outer();
		outer.speak();
	}
}
