package decorator;

public class Test {

	public static void main(String[] args) {
		
		Humburger humburger = new ChickenBurger();
		
		System.out.println(humburger.getName()+"的价格是：" + humburger.getPrice());
		
		Lettuce lettuce = new Lettuce(humburger);
		System.out.println(lettuce.getName()+"的价格是：" + lettuce.getPrice());
		
		Chilli chilli = new Chilli(humburger);
		System.out.println(chilli.getName()+"的价格是：" + chilli.getPrice());
	}

}
