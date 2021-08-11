package com.syntaxClass005;

public class Task {
	public static void main(String[]args) {
		
		
		String shortUnder="59";
		String heights="60";
		String medium="72";
		String tall="72";
		
		if(heights.equals(tall) || heights.equals (medium)) {
			
			System.out.println("Please tell me your height");
			
		}else if (heights.equals(medium)|| heights.equals(tall)) {
			
			System.out.println("get ready to check your heights");
		}else {
			System.out.println("End of my code");
			
		}
		
		
		
		
	}

}
