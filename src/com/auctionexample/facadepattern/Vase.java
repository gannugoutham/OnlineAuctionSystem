package com.auctionexample.facadepattern;

public class Vase implements Item{
	
	
	
	public Vase() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("You have an Chinese Vase");
	}
	

}
