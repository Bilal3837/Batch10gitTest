package com.syntax.Class10;

import java.util.Scanner;

public class RecapOfArray {

	public static void main(String[] args) {
		
		
		int [] array= {13};
		//array[1]=12;
		System.out.println(array.length);
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many element do you want to store inside an array");

		int size=scan.nextInt();
	
		int[] number=new int [size];
		
		for (int i=0; i<size; i++) {
			number[i]=scan.nextInt();
			
		}
		
		System.out.println(" Display all elements from an array");
	
	
	}

}
