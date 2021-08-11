package com.syntax.Class10;

import java.util.Scanner;

public class Task {
	public static void main(String[] args) {

		
		
		Scanner scan;
		double[] array;
		double sum=0.0;
		
		
		scan=new Scanner(System.in);
		System.out.println("How many Element do you want to store inside an array");
		
		int size=scan.nextInt();
		
		array=new double [size];
		
		
		for(int i=0; i<size; i++) {
		
		sum+=array[i];
		}
		System.out.println("Total "+sum);		
		
		
		
		
	}
}
