package com.auctionexample.facadepattern;

public class Painting implements Item{
	
	
	
	public Painting() {
		super();
	}

	@Override
	public void showItem() {
		System.out.println("You have an 19th Century Painting");
	}

}
