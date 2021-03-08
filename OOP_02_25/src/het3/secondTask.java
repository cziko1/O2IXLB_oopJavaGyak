package het3;

import java.util.Arrays;




public class secondTask {

	public static void main(String[] args) {
		int[] array = new int[10];
		double[] array2 = new double[10];
		
		upload(array);
		print(array);
		System.out.print("\n");
		Arrays.sort(array);
		print(array);
		System.out.print("\n");
		
		System.out.println("Binary Searching: "+Arrays.binarySearch(array, 5));
		System.out.println("Biggest parity: "+ getBiggestPair(array));
		System.out.println("Biggest parity: "+ getBiggestPairsForEach(array));
		System.out.println("Squarts number: "+getBiggestSquartsNumbers(array));
		System.out.println("Array mathces: "+ Arrays.equals(array,  array));
		
		
		System.out.print("\n");
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (Math.random() * 50) + 1;
		}
		
		for(int i = 0; i< array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println("Geometric Average: "+ geometricAverage(array2));
		
	}
	
	private static void upload(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*50)+1;
		}
	}
	private static void print (int[] array) {
		
		for(int number : array) {
			System.out.println("Element: "+number);
		}
	}
	private static int getBiggestPair(int[] array) {
		int max = -1;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0 && array[i] >max) {
				max = array[i];
			}
		}
		return max;
	}
	private static int getBiggestPairsForEach(int[] array) {
		int max = -1;
		
		for(int number : array) {
			if(number % 2 == 0 && number >max) {
				max = number;
			}
		}
		return max;
	}
	
	private static int getBiggestSquartsNumbers(int[] array) {
		int db = 0;
		 for (int number : array) {
			if(Math.sqrt(number) % 1 ==0) {
				db++;
				System.out.println("Squart Numbers: "+ number);
			}
		}
		 return db;
	}
	
	private static double geometricAverage(double[] array) {
		double mean = 1;
		for (double item : array) {
			mean *= item;
		}
		return Math.pow(mean, 1.0 /(double) array.length);
	}
	

}
