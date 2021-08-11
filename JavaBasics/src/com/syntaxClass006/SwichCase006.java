package com.syntaxClass006;

public class SwichCase006 {

	public static void main(String[] args) {
		
		int day=7;
		String dayName;
		if(day==1) {
			System.out.println("Today is monday");
			
		}else if (day==2) {
			System.out.println("Today is Tuesday");
			
		}else if (day==3) {
			System.out.println("Today is Wednesday");
		}else if(day==4) {
			System.out.println("Today is Thursday");
		}else if (day==5) {
			System.out.println("Today is Friday");
		}else if (day==6) {
			System.out.println("Today is Saturday");
		}else if (day==7) {
			System.out.println("Today is Sunday");
		}else {
			System.err.println(day+" is invalid day number, Please use day from 1-7");
		}
		
		System.out.println("------using SWTICH STATEMENT");


		switch (day) {
		
		case 1:
			dayName="Monday";
			break;
		case 2:
			dayName="Tuesday";
			break;
		case 3:
			dayName="Wednesday";
			break;
		case 4:
			dayName="Thursday";
			break;
		case 5:
			dayName="Friday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			default:
				dayName="Invalid";
				break;
						
		}
	System.out.println("Today is "+dayName);
	}

}
