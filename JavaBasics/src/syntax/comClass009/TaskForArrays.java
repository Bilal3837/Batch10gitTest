package syntax.comClass009;

public class TaskForArrays {

	public static void main(String[] args) {
		
		char[] a=new char[6];
		
		a[0]='A';
		a[1]='B';
		a[2]='C';
		a[3]='D';
		a[4]='E';
		a[5]='F';
		
		System.out.println(a[1]);

		
		String[] gNames=new String[6];
		
		gNames[0]="Sharif the Super Talented guy";
		gNames[1]="Ehsan Super quit";
		gNames[2]="Javid Mr boo";
		gNames[3]="Noor the complainer";
		gNames[4]="Bilal the Winner";
		gNames[5]="Jacline";
		
		String[] gName= {"Sharif the Super Talented guy", "Ehsan Super quit", "Javid Mr boo", "Noor the complainer", "Bilal the Winner", "Jacline" };
		System.out.println(gName[5]);
		
		for(String g:gNames) {
			System.out.println(g);
		}
	}

}
