package sytax.com003;

public class WhatHappens {

	public static void main(String[] args) {

		// int i=1.99; // it will give me an error because it's a

		double d = 1000; // widening

		System.out.println(d); // it will automatic convert it.
		// Casting in JAVA: widening/implicit/automatic

		int i = (int) 1.99;
		System.out.println(i);

		int num = 20;
		int num1 = 3;

		System.out.println(num / num1);

		float num2 = 20f;
		double num3 = 3f;
		System.out.println(num2 / num3);

		int t = 20;
		int t2 = 3;

		double dd = t / t2;

		System.out.println(dd);

	}

}
