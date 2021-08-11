package com.syntaxClass006;

public class SwitchDemo006 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if statement is a condition based statement.
		// if statement is like a ladder 
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
			System.out.println(day+" is invalid day number, Please use day from 1-7");
		}	
		System.out.println("========SWTICH STATEMENT");
		// Switch is a value based statement. if find matching value case and jumps right away
		/*Switch is like elevator
		 * 
		 * always use break;--> to stop and get out from switch block
		 *  variable type and case value MUST be the same DATA TYPE
		 *  
		 */
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
			dayName="Frieday";
			break;
		case 6:
			dayName="Saturday";
			break;
		case 7:
			dayName="Sunday";
			break;
			
			default:
				dayName="Invalid";
		}	
		System.out.println("Today is "+dayName);
		
				
		
		
		
		}

}
