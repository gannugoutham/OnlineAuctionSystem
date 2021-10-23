package com.auctionexample.commandpattern;

import java.util.ArrayList;
import java.util.List;

public class Auctioneer {
	private List<Bid> bidList = new ArrayList<Bid>();
	
	public void addBids(Bid bid) {
		bidList.add(bid);
	}
	public void processBids() {
		for(Bid bid: bidList) {
			bid.processBid();
		}
		bidList.clear();
	}
}
