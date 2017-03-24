package base;

//封装学生类
public class Student {

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age <0){
			System.out.println("wrong");
			this.age = 10;
		}else{
			this.age = 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private int age;
	private String name;
	void introduce(){
		System.out.println("my name is:" + name + ",i am" + age + "years old");
	}
	
	public static void main(String[] arge){
		Student stu = new Student();
		stu.setAge(1);
		stu.setName("Song");
		stu.introduce();
	}
}
