package com.syntax.Class10;

public class TwoArraysExamples {

	public static void main(String[] args) {
		String [][] food = {
				
				
				{"Borsh", "Vereniki", "draniki"},
				{"kebab", "Palaow", "Mantu"},
				{"Tacos", "Burito", "quesso", "Salsa"},
				{"pasa", "Pizza", "bread", "risotto"},
		
				};

	
	System.out.println(food.length);
	int sizeOfArrays=food[0].length;
	
	System.out.println(food[3][1]);
	int sizeOfarrays=food[3].length;
	
	food[3][2]="Cheese";
	
	System.out.println(food[3][2]);
	
	// How to get all values from 2d array
	
	for (int i=0; i<food.length; i++) {
		
		for (int j=0; j<food[i].length; j++) {
			
			System.out.println(food[i][j]+" ");
		
		}
	}
	
	}

}
