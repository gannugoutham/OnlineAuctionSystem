package com.auctionexample.adapterpattern;

public class AuctionItemAdapter implements MultipleItems{
	SingleItem singleItem;
	
	public AuctionItemAdapter(String str) {
		super();
		if(str.equalsIgnoreCase("Single")) {
			singleItem = new CheckItemPrice();
		}
		if(str.equalsIgnoreCase("Multiple")) {
			singleItem = new CheckItemType();
		}
	}

	@Override
	public void getItemDetails(String itemType, String name) {
		if(itemType.equalsIgnoreCase("Single")) {
			singleItem.checkItemPrice(name);
		}
		if(itemType.equalsIgnoreCase("Multiple")) {
			singleItem.checkItemType(name);
		}
		
	}

}
