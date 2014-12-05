//Player Class Improved
package org.example.learn;

public class SecurePlayer {
	//instance variables (fields in java jargon)
	private String handlename;
	private int lives;
	private int level;
	private int score;
	
	//methods
	
	//constructor
	public SecurePlayer() {
		//set all default values
		lives = 3;
		level = 1;
		score = 0;
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
}
