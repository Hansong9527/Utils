package decorator;

public class Chilli extends Condiment {

	Humburger humburger;
	public Chilli(Humburger humburger){
		this.humburger = humburger;
	}
	
	public String getName(){
		return humburger.getName()+ "加辣椒";
	}
	
	public double getPrice(){
		return humburger.getPrice();
	}
}
