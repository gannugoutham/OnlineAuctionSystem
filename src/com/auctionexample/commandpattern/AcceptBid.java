package com.auctionexample.commandpattern;

public class AcceptBid implements Bid{
	private AuctionItem itemOrder;
	
	public AcceptBid(AuctionItem itemOrder) {
		
		this.itemOrder = itemOrder;
	}

	

	@Override
	public void processBid() {
		itemOrder.accept();
		
	}
}
