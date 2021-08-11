package com.syntax004;

public class AnotherNestedif {

	public static void main(String[] args) {
		
		/*
		 * we have test --> yes or no
		 * 
		 * if you done test then i want to check the score
		 * 
		 * score is more then 90 A Student
		 * Score is more then 80 B Student
		 * score is more then 70 C Student
		 * 
		 * otherwise: you should study more for test
		 * 
		 */

		
		boolean isCompleted=true;
		int score=95;
		
		if (isCompleted) {
			System.out.println("Let's check your grade");
			if(score>90) {
				
			}
		}else {
			System.out.println("You Should have taken the test");
		}
		
		
	}

}
