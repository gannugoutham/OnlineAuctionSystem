package com.auctionexample.factorypattern;

public class Table implements Item{
	
	
	
	public Table() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("It is an antique Table");
	}

}
