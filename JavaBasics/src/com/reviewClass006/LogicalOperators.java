package com.reviewClass006;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		String userName = "Maria";
		String password = "pass123";
int availableFunds=10000;

if (userName.equals("Maria")&& password.equals("pass123")) {
	System.out.println("Enter the amount of Money that you want to transfer");
	Scanner scan=new Scanner(System.in);
	double amountToTransfer=scan.nextDouble();
	if(amountToTransfer< availableFunds) {
		System.out.println("Transfer successful");
	}else {
		System.out.println("Insufficient balance");
	
	}
	
}else {
	System.out.println("Invalid Credentials");
}

	}

}
