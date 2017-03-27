package com.hans.designmode.factoty;

public class PizzaStore {

	PizzaFactory factory;
	public PizzaStore(PizzaFactory factory){
		this.factory = factory;
	}
	
	public Pizza orderPizza(String type){
		Pizza pizza;
//		type = "China";
		pizza = factory.creatPizza(type);
		
		return pizza;
	}
}
