package org.example.learn;

public class Demo2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//first we will test conditionals..
		int lives = 3;
		//show long hand for if evaluation
		//explicit boolean declaration
		//instead of implicitly in 
		//loop condition
		boolean isGameOver = (lives < 1);
		/*print boolean just to see what the
		 * contained data looks like. 
		 */
		System.out.println(isGameOver);
		
		if (isGameOver){
			System.out.println("Game Over!");
		}
		else{
			System.out.println("You are still alive!");
		}
		Player marv = new Player(); 
		//instantiating member of class
		System.out.println(marv.handlename);
		//accessing data within class (insecure)
		//hamdlename is undefined as of now.
		marv.handlename = "Marv";
		//setting name (insecure)
		System.out.println(marv.handlename);
		//prints handlename (insecure)
		
		// never access members outside the class
		// use get/set methods
		
		//Use new class
		SecurePlayer secureMarv = new SecurePlayer();
		System.out.println(secureMarv.getHandlename());
		//improved way to access name, still undefined though
		secureMarv.setHandlename("Secure Marv");
		//defines name of the secureMarv object (secure)
		System.out.println(secureMarv.getHandlename());
		//returns name of object to println function (secure)
		
		SecurePlayer lola = new SecurePlayer();
		lola.setNameAndLevel("Lola", 9001);
		System.out.println(lola.getHandlename());
		System.out.println(lola.getLevel());
		System.out.println(lola.getWeapon().getName());
		
		
		
	}

}
