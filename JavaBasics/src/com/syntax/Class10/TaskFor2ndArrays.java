package com.syntax.Class10;

public class TaskFor2ndArrays {

	public static void main(String[] args) {
		
		String[][]names= {
				{"MR", "Mrs", "MS", "Miss", },
				{"Smith", "Jordan", "Jackson", "Obama" },
				};
		
		System.out.println(names[0][2]+" "+names[1][1]);
		
		String [] [] name= {
				{"Sharif", "Noor", "Ehsan"},
				{"A", "B", "C"},
			};
		
		System.out.println(name[0][1]+" "+name[1][1]);
		System.out.println(name[1][2]);
		
		for(int i=0; i<names.length; i++) {
			for (int j=0; j<names.length; j++ ) {
				System.out.print(names[i][j]+" ");
			
			System.out.println("---------------------");
			
			for(String[] n:names) {
				System.out.println(n);
			}
			
			
			
			}
		}

		
	}

}
