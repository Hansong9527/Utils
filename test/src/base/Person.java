package base;


//定义对象
public class Person {

	int age = 10;
	void speak(){
		System.out.println("I'm" + age + "years old");
	}
	
	public static void main(String[] args){
		Person person = new Person();
		person.speak();
		
		Person p1 = new Person();
		p1.age = 15;
		p1.speak();
	}
}
