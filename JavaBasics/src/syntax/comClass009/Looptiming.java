package syntax.comClass009;

public class Looptiming {

	public static void main(String[] args) {
		
		
		
		for(int c=0; c<=23; c++) {
			for(int d=0; d<=59; d++) {
				
				if(c<= 9 && d<=0) {
				
					System.out.println("0" + c + ":" + "0" + d);
				
				}else if(c<9) {
					System.out.println("0" + c + ":" + d);
				
				}else if(d<9) {
					System.out.println(c + ":" + "0" + d);
				
				}else {
				System.out.println(c + ":" + d);
			}
			System.out.println();
			}
			}

	}

}
