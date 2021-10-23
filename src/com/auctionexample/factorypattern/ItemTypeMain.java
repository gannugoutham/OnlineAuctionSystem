package com.auctionexample.factorypattern;

public class ItemTypeMain {

	public static void main(String[] args) {
		ItemFactory itemFactory = new ItemFactory();
		Item it1 = itemFactory.getItem("Painting");
		it1.showItem();
		Item it2 = itemFactory.getItem("Table");
		it2.showItem();
		Item it3 = itemFactory.getItem("Vase");
		it3.showItem();
	}

}
