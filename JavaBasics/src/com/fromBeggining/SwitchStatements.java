package com.fromBeggining;

import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {

		System.out.println("Enter name of the instructor");
		Scanner scan=new Scanner(System.in);
		String name;
		name=scan.nextLine();

		switch (name){
		case "Asghar":
		name="Will take care of Java Assignment";
		break;
		case "Moazzam":
		name="Will take care of SDLC Assignment";
		break;
		case "Weqas":
		name="Will take care of Selenium Assignment";
		break;
		case "Asel":
		name="Will take care of every Assignment";
		break;
		default:
		System.out.println("Invalid instructor selected");
		break;
		}
		}

}
