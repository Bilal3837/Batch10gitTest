package com.syntaxClass008;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner scan;
		String item;
		
		double price, money, total=0, change;
		
		scan=new Scanner(System.in);
		System.out.println("What item do you want to buy?");
		
		item=scan.nextLine();
		
		System.out.println("what's the price of the item?");
		price=scan.nextDouble();
		System.out.println("Please pay for the item");
		do {
		
		money=scan.nextDouble();
		
		total+=money;
		
		if (total>price) {
				change=total-price;
				System.out.println("Here is your change "+change );
			break;
			}else if (total<price) {
				System.out.println("Please give more "+(price-total));
		}else {
			System.out.println("That is the exact amount");
		}
		
		} while(total!=price);
		System.out.println("Thank you for shopping");
		{
		}
	}

}
