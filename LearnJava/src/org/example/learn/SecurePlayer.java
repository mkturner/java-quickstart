//Player Class Improved
package org.example.learn;

public class SecurePlayer {
	//instance variables (fields in java jargon)
	private String handlename;
	private int lives;
	private int level;
	private int score;
	private Weapon weapon;
	
	//methods
	
	//constructor
	public SecurePlayer() {
		//set all default values
		this.lives = 3;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
	}
	
	// second constructor, for when you want to set
	// the name of the new object upon creation.
	public SecurePlayer(String handle) {
		/*set all default values
		* NEW: ability to define name during instantiation
		* using different constructor 
		*/
		setHandlename(handle);
		this.lives = 3;
		this.level = 1;
		this.score = 0;
		setDefaultWeapon();
	}
	
	public String getHandlename() {
		return handlename;
	}

	public void setHandlename(String handlename) {
		this.handlename = handlename;
	}

	public int getLives() {
		return lives;
	}

	public void setLives(int lives) {
		this.lives = lives;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	public void setNameAndLevel(String name, int level){
		this.handlename = name;
		this.level = level;
	}
	private void setDefaultWeapon(){
		this.weapon = new Weapon("Sword", 10, 20);
	}

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	
}
