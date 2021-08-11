package com.syntax004;

import java.util.Scanner;

public class AnotherScan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ctrl+shift O for import
		
				Scanner input=new Scanner(System.in);
		  System.out.println("Please Enter Temprerature");
		  String city=input.nextLine();
		  double temp=input.nextDouble();
		  
		  
		  System.out.println("It is "+temp+" In "+city);
	}
	

}
