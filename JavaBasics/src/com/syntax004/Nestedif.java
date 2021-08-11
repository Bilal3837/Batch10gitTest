package com.syntax004;

public class Nestedif {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean vaccine = true;

		boolean secondDose = true;

		if (vaccine) { /// yes / outer

			System.out.println("Let's check how many doses you got");

			if (secondDose) { // inner

				System.out.println("you are fully vaccinated");

			} else {
				System.out.println("You will need to get a 2nd dose.");
				
			}
			
			System.out.println("End of outer if Block");
		
		}
		System.out.println("End the code");
	
		System.out.println("-----ANOTHER EXAMPLE OF NESTED IF ---------------");
	
	/*Every friday is a movie day.
	 * if it's the 13th --> you want to watch a scary movie
	 * 
	 * 
	 */
	int day=13;
	boolean isFriday=true;
			
			if (isFriday) {
				
				
				System.out.println("I am going to watch a movie");
				
				if (day==13) { 
				
					System.out.println("Yay, I am watching a Scary movie");
			}else {
				
			}
				
				System.out.println("I am going to study");
				
			}
	
	
	}

}
