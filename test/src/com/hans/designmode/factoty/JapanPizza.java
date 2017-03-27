package com.hans.designmode.factoty;

public class JapanPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("Japan");
		System.out.println("prepare Pizza");
		
	}

	@Override
	public void make() {
		System.out.println("making Pizza");
		
	}

	@Override
	public void finash() {
		System.out.println("finashed");
		
	}
}
