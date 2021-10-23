package com.auctionexample.facadepattern;

public class ItemFacade {
	private Item i1;
	private Item i2;
	public ItemFacade() {
		i1 = new Painting();
		i2 = new Table();
	}
	public void showItemOne() {
		i1.showItem();
	}
	public void showItemTwo() {
		i2.showItem();
	}

}
