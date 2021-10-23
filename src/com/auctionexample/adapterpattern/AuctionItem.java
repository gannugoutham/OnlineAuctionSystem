package com.auctionexample.adapterpattern;

public class AuctionItem  implements MultipleItems{
	MultipleItems multipleItems;
	@Override
	public void getItemDetails(String itemType, String name) {

	      if(itemType.equalsIgnoreCase("Painting")){
	         System.out.println("This is a painting named "+name);			
	      } 
	      
	      //mediaAdapter is providing support to play other file formats
	      else if(itemType.equalsIgnoreCase("single") || itemType.equalsIgnoreCase("multiple")){
	    	  multipleItems = new AuctionItemAdapter(itemType);
	    	  multipleItems.getItemDetails(itemType, name);
	      }
	      
	      else{
	         System.out.println("Invalid item Type. " + itemType);
	      }
		
	}

}
