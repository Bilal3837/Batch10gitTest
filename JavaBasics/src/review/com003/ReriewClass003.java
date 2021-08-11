package review.com003;

public class ReriewClass003 {
	public static void main(String[] args) {
		

// we Have 2 types of Java casting --> Widening and narrowing.
// Widening Casting (automatically) - converting a smaller type to a larger type size.
		// byte -> short -> char -> int -> long -> float -> double
// Narrowing Casting (manually) - converting a larger type to a smaller size type.
		//double -> float -> long -> int -> char -> short -> byte
		
		int myInt=9;
	double myDouble = myInt;
	
	
	System.out.println(myDouble);
	
	double myNum=9.22;
	
	int mynum1= (int) myNum;
	
	System.out.println(mynum1);
	
		
		
	}		


}
