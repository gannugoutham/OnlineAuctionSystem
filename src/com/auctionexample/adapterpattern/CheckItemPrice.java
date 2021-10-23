package com.auctionexample.adapterpattern;

public class CheckItemPrice implements SingleItem{

	@Override
	public void checkItemType(String name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void checkItemPrice(String name) {
		System.out.println("Item price for "+name+" is 1000");
		
	}

}
