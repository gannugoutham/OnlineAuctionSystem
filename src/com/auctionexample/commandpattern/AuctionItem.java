package com.auctionexample.commandpattern;

public class AuctionItem {
	
	public AuctionItem() {
		super();
	}
	public void accept() {
		System.out.println("The item bid is placed");
	}
	public void raiseBid() {
		System.out.println("The item bid has increased");
	}
}
