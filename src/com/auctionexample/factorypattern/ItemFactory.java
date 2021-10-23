package com.auctionexample.factorypattern;

public class ItemFactory {
	public Item getItem(String item) {
		if (item.equals("Painting")) {
			return new Painting();
		}
		if (item.equals("Table")) {
			return new Table();
		}
		if (item.equals("Vase")) {
			return new Vase();
		} else {
			return null;
		}
	}
}
