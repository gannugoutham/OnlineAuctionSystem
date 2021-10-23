package com.auctionexample.adapterpattern;

public class AuctionItemMain {

	public static void main(String[] args) {
		AuctionItem item = new AuctionItem();
		item.getItemDetails("painting", "Charlotte");
		item.getItemDetails("single", "Infinity Vase");
		item.getItemDetails("multiple", "Select Painting set");
		
	}

}
