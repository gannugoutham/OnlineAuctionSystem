package com.auctionexample.facadepattern;

public class Table implements Item{
	
	
	
	public Table() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("You have an antique Table");
	}

}
