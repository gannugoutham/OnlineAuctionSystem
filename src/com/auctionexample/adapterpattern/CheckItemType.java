package com.auctionexample.adapterpattern;

public class CheckItemType implements SingleItem{

	@Override
	public void checkItemType(String name) {
		System.out.println("Item type for "+ name + " is Art");
		
	}

	@Override
	public void checkItemPrice(String name) {
		
		
	}

}
