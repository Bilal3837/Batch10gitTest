package syntax.comClass009;

public class Task {
	public static void main(String[] args) {

		String[] cars= {"Toyoya", "Benz", "Truck", "BMW", "SuperCar", "YourCar"};
		
		
		
		for(int i=0; i<cars.length; i++ ) {
			
			System.out.println(cars[i]);
		}
		
		// advance for loop can only works with the Arrays.
		
		for(String car: cars ) {
			
			System.out.println(car);
		}
		
		int[] numbers= {100, 20, 67, 45, 90, 23};
		
		for(int b=0; b<numbers.length; b++) {
			
			System.out.println(numbers[b]);
			
		}
		//now we using advance loop
		
		for(int num:numbers) {
			System.out.println(num);
		}
		
		
		
	}
}
