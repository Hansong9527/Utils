package decorator;

public class Lettuce {

	Humburger humburger;
	
	public Lettuce(Humburger humburger){
		this.humburger = humburger;
	}
	
	public String getName(){
		return humburger.getName()+"加生菜";
	}
	
	public double getPrice(){
		return humburger.getPrice()+ 0.5;
	}
}
