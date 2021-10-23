package com.auctionexample.factorypattern;

public class Painting implements Item{
	
	
	
	public Painting() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("It is an 19th Century Painting");
	}

}
