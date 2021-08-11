package com.syntaxClass005;

public class Replit36 {

	public static void main(String[] args) {
	
		int score=600;
String eligibility;
boolean yes;

		if(score < 600){
	        eligibility = "Not eligible";
	      }else if(score >= 600 && score <=700){
	        eligibility = "Maybe eligible";
	      }else if(score > 700 && score <=800){
	        eligibility = "Eligible";
	      }else if(score > 801){
	        eligibility = "Definitely eligible";
	    }else{
	      eligibility = "Unknown";
	    }
	      System.out.println("The eligibility is " + eligibility);
		
		
			
		
		
		
	}

}
