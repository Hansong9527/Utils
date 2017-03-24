package base;

//构造方法
public class ConstructionMethod {

	public ConstructionMethod(){
		System.out.println("构造方法被调用了");
	}
	void speak(){
		System.out.println("非构造方法被调用了");
	}
	
	public static void main(String[] args){
		ConstructionMethod cm = new ConstructionMethod();
		cm.speak();
	}
	
}
