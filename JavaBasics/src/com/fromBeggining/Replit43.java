package com.fromBeggining;

import java.util.Scanner;

public class Replit43 {

	public static void main(String[] args) {
		
		String month;
		int num;
		System.out.println("Input a number between 1-12");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();

		switch(num){
		case 1:
		month="January";
		break;

		case 2:
		month="Febraury";
		break;

		case 3:
		month="March";
		break;

		case 4:
		month="April";
		break;

		case 5:
		month="May";
		break;

		case 6:
		month="June";
		break;

		case 7:
		month="July";
		break;

		case 8:
		month="August";
		break;

		case 9:
		month="September";
		break;

		case 10:
		month="October";
		break;

		case 11:
		month="November";
		break;

		case 12:
		month="December";
		break;
		default:
		case 13:
		month="Invalid";
		break;
		}

		System.out.println(month);
		

	}

}
