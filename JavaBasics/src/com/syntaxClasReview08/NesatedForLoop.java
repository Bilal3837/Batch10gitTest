package com.syntaxClasReview08;

public class NesatedForLoop {

	public static void main(String[] args) {
		
		int x=0;
		for (int i=0; i < 10; i++) {
		x=i;
		
		while (x<5) {
			System.out.println(x);
		x++;
		}
		
		}
		
		

	}

}
