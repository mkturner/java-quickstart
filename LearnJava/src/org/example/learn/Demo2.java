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
		if (isGameOver){
			System.out.println("Game Over!");
		}
		else{
			System.out.println("You are still alive!");
		}
	}

}
