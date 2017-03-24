package object;

public class ObjectRunFuc {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		dog.name = "dog";
		cat.name = "cat";
		
		cat.nameOut();
		cat.shout();
		dog.nameOut();
		dog.shout();

	}

}
