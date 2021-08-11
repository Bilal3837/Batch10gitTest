package syntax.comClass009;

public class ArraysInJava {

	public static void main(String[] args) {

		int[] arr = new int[5];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;

		System.out.println(arr[4]+" "+arr[1]);
		
		//String data
		
		String[] days = new String[7];

		days[0] = "M";
		days[1] = "T";
		days[2] = "W";
		days[3] = "Th";
		days[4] = "F";
		days[5] = "S";
		days[6]="Sat";

	System.out.println(days[6]+" "+days[5]);
	
	boolean[]boo=new boolean[3];
	boo[0]=true;
	boo[1]=true;
	boo[2]=false;
	
	// arrays are fix in size
	double[] d=new double[4];
	d[0]=10.99;
	d[2]=12.99;
	d[3]=10; //widning or auto change
	d[5]=1.99;
	System.out.println(d[5]);
	
	
	
	}
}
