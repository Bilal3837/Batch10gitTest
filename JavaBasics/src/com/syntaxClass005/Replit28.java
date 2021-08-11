package com.syntaxClass005;

import java.util.Scanner;

public class Replit28 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the lenth");
		int length=scan.nextInt();
		
		Scanner s=new Scanner(System.in);
		System.out.println("Pleae enter the width");
		int width=s.nextInt();
		
		if(length==18 || (width==16)) {
			System.out.println("The shape of your object is rectangle");
		}

		Scanner a=new Scanner (System.in);
		System.out.println("Please enter the length");
	int length1=a.nextInt();
	
	Scanner b=new Scanner(System.in);
	System.out.println("Please enter your width");
	int width1=b.nextInt();
	
	if (width1==16 || (length==16)){
		System.out.println("The Shape of your object is square");
		
	}
	}

}
