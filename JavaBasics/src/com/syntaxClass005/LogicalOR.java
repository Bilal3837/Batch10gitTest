package com.syntaxClass005;

public class LogicalOR {

	public static void main(String[] args) {
		
		/*Define a day
		 * if day is monday or Friday --> No class
		 * if day is tuesday or wednesday --> Manual class
		 *if day is thursday --> review class
		 *if day is Sat or Sunday --> Java class
		 *
		 */
		
		String day="Tuesdayy";
		
		if (day.equals("monday") || day.equals ("Friday")) {
System.out.println("We Have no class at Syntax");
		
		}else if (day.equals("Tuesday") || day.equals ("wednesday")) {
			System.out.println("today is Manual class");
		}else if (day.equals("Thursday")) {
			System.out.println("Today is our review class");
		}else if (day.equals ("Saturday") || day.equals("Sunday")) {
			
			System.out.println("Todya is my Fav Java class");
		}else {
			System.out.println("Please specify valid day");
		}
	}

}
