package com.syntax.Class10;

public class ArraysRows {

	public static void main(String[] args) {
		
		int a;
		int[] b=new int[4];
		

				
				
				
		
				int[][] c =new int[3][4];
		//1 row or 1 array
		c[0][0]=11;
		c[0][0]=12;
		c[0][0]=13;
		c[0][0]=14;
		
		// 2 row 2 arrays
		
		c[1][0]=20;
		c[1][1]=30;
		c[1][2]=40;
		c[1][3]=50;
		
		
		//3 row or 3 arrays
		c[2][0]=100;
		c[2][1]=200;
		c[2][2]=300;
		c[2][3]=400;
		System.out.println(c[2][0]);
		System.out.println(c[1][2]);
		
		System.out.println("----Another way of shortcut 2D arrays or Raw");
		int[][] myArray= {
				{11, 12, 13, 14, 15 },
				{100, 200, 300, 400,},
				
		};
				System.out.println(myArray[0][4]);
				System.out.println(myArray[1][0]);
		
		
	
		
	
	}

}
