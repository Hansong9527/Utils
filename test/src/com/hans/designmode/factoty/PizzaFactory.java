package com.hans.designmode.factoty;

public class PizzaFactory {
	
	public Pizza creatPizza(String type){
		Pizza pizza = null;
		if(type.equals("China")){
			pizza = new ChinaPizza();
		}else{
			pizza = new JapanPizza();
		}
		return pizza;
	} 
}
