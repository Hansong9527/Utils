package com.hans.designmode.factoty;

public class ChinaPizza implements Pizza {

	@Override
	public void prepare() {
		System.out.println("China!");
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
