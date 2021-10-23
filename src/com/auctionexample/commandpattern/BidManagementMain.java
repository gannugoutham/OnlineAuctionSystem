package com.auctionexample.commandpattern;

public class BidManagementMain {

	public static void main(String[] args) {
		AuctionItem s1 = new AuctionItem();
		AuctionItem s2 = new AuctionItem();
		
		AcceptBid aBid = new AcceptBid(s1);
		RaiseBid rBid = new RaiseBid(s2);
		
		Auctioneer agent = new Auctioneer();
		agent.addBids(aBid);
		agent.addBids(rBid);
		
		agent.processBids();
		
	}

}
