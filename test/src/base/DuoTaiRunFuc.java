package base;

public class DuoTaiRunFuc {

	public static void main(String[] args) {
		DuoTaiTest dog = new DuoTaiDog();
		DuoTaiTest cat = new DuoTaiCat();
		
		animalShout(dog);
		animalShout(cat);
	}
	
	public static void animalShout(DuoTaiTest a){
		a.shout();
	}

}
