package com.syntax.Class007;

public class ForLoopMoreExample {

	public static void main(String[] args) {
		
		/* I want to print Multiply numbers
		 * 
		 * 
		 */
		
		
		
int num=3;

for(int i=1; i<=10; i++ ) {
	
	System.out.println(num+"X "+i+ " = "+num*i);


}

System.out.println("What is the output");

int sum=0;
for (int i=1; i<=5; i++) {
	sum=sum+i;
	
}
	System.out.println(sum);
	
	sum=0;
	for (int i=0; i<=40; i+=10) {
		sum+=i;
	}
	System.out.println(sum);
	}

}
