package syntax.comClass009;

public class TaskHomeWork {

	public static void main(String[] args) {

 String[] cars= {"BMW", "Ferrari", "Bugati", "Toyota", "Benz", "Camry", "Supercar"};
 
 
 
 for(int i=0; i<cars.length; i++) {
	 System.out.println(cars[i]);
 }
	System.out.println("-----------------Advance loop-----"); 
	
	
	for(String nameCars:cars) {
		 System.out.println(nameCars);
	 }
	 
 double [] numbers= {10.99, 15.1, 1.99, 23.99};
 
 for (int a=numbers.length-1; a>=0; a--) {
	 
	 System.out.println(numbers[a]);
 }
	 
 int sum=0;
	int[] number = {10, 5, 12, 45, 4, 3};
		for(int i=0; i< number.length; i++) {
			sum += numbers[i];
		}
		System.out.println("The sum of array values is: " + sum);

	 
 
		
		
		
		

	}

}
