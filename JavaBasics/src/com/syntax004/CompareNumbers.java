package com.syntax004;

import java.util.Scanner;

public class CompareNumbers {
public static void main(String[] args) {
	
	//compare 2 number and see which one is the largest
	
	
	
	Scanner data=new Scanner(System.in);
	
	System.out.println("please enter first numer");
	
	int num1=data.nextInt();
	
	System.out.println("Please enter a second number");
int num2=data.nextInt();


if (num1>num2) {
	System.out.println(num1+"is larger then "+num2);

}else if(num1<num2) { 
	System.out.println(num1+" is smaller then "+num2);
}else
	System.out.println(num1+"is equal to "+num2);


}

}
