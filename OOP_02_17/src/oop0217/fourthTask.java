package oop0217;

import java.util.*;

public class fourthTask {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in) ;
		
		int size;
				
		do {
			System.out.println("Enter the nubmer between 1 and 10");
			while(!input.hasNextInt()) {
				System.out.println("That isn't a number");
				input.next();
			}
			size=input.nextInt();
			
		}while(size < 1 || size > 10);
		

		System.out.println("Kerem a nevet: ");
		String[] array = new String [size];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = input.next();
		}
		input.close();
		
		isPrintArray(array);
		
		
		System.out.println("How many pairs have been same?: "+ isSame(array));
		
		
		System.out.println("How many word have been same the first letter?: " + sameFirstLetter(array));
	
	}
	
	public static void isPrintArray(String[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.println((i+1)+".element: "+x[i]);
		}
		
	}
	
	public static int isSame(String[] x) {
		
		int db=0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i] .equals(x[j])) {
					db++;
					//System.out.println("These have been same: "+ x[i]+" "+ x[j]);
				}
			}
		}
		//System.out.println("How many have been same?: "+ db);
		
		return db;
		
	}
			
	public static int sameFirstLetter(String[] x){
		int db=0;
		
		for (int i = 0; i < x.length; i++) {
			for (int j = i+1; j < x.length; j++) {
				if(x[i] .charAt(0)==x[j].charAt(0)) {
					db++;
					System.out.println("These have been same: "+ x[i]+" "+ x[j]);
				}
			}
		}
		return db;
	}
	
	

}
