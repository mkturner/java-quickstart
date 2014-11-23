package org.example.learn;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//making variables
		String testMessage = "This in another test";
		String mySecondMessage = " demo";
		
		//printing to console window
		System.out.println("This is my test message");
		System.out.println("Hello World");
		
		//printing using variables
		System.out.println(testMessage);
		
		//string concatentation
		System.out.println(testMessage+mySecondMessage);
		
		//declare ints
		int firstNumber = 55;
		int secondNumber = 5;
		
		//simple aritmetic
		int result = (firstNumber + secondNumber) * 5;
		//print result to console
		System.out.println(result);
		
		//doubles
		double myValue = 1234.56789101112;
		double mySecondValue = 3.14159;
		
		//add doubles, print result 
		System.out.println(myValue + mySecondValue);
	}

}
