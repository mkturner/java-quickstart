package org.example.learn;

import java.util.ArrayList;

public class Demo3 {
	
	public static void main(String[] args){
		System.out.println("Create Object with default Weapon:");
		SecurePlayer bawse = new SecurePlayer("Rick Ross", 5);
		System.out.println(bawse.getHandlename());
		System.out.println(bawse.getWeapon().getName());
		System.out.println("");
		
		System.out.println("Now, Change weapon of the object:");
		Weapon bawseAxe = new Weapon("Maybach Axe", 15, 50);
		bawse.setWeapon(bawseAxe);
		System.out.println(bawse.getWeapon().getName());
		
		//create Item Record Deal
		InventoryItem recordDeal = new InventoryItem(ItemType.ARMOR, "Record Deal");
		//step A: create new item
		//add Record Deal to the inventory of bawse object
		bawse.addInventoryItem(recordDeal);  
		//Step B: add to object
		
		//Combine steps A and B, do simultaneously
		//We don't NEED to store the new item to make it
		bawse.addInventoryItem(new InventoryItem(ItemType.RING, "MMG Ring"));
		
		//Show all items belonging to bawse object
		//aggregate all items into allItems
		ArrayList<InventoryItem> allItems = bawse.getInventoryItems();
		//for every item in allItems, print that item
		for(InventoryItem item : allItems){
			System.out.println(item.getName());
		}
	}	
}
