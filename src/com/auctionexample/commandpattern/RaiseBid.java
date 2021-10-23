package com.auctionexample.commandpattern;

public class RaiseBid implements Bid {
	private AuctionItem auctionItem;
	
	public RaiseBid(AuctionItem auctionItem) {
		
		this.auctionItem = auctionItem;
	}

	

	@Override
	public void processBid() {
		this.auctionItem.raiseBid();
		
	}
}
