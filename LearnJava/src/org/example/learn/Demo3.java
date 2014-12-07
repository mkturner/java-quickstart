package org.example.learn;

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
	}	
}
