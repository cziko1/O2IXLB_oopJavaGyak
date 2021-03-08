package oop0210;

import java.util.Scanner;

public class fourthTask {

	public static void main (String[] args ) {
		int[][] matrix = new int[5][3];
		
		array2D(matrix);
		
		isPrintArray2D(matrix);
			
		int keresett = readInt();
			
		System.out.println(linearSearching(matrix,keresett) );
			
			
	}

	private static boolean linearSearching(int[][] matrix, int keresett) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == keresett) {
						return true;
					}
				}
			}
			return false;
		}

		private static void isPrintArray2D(int[][] isPrintArray2D) {
			for (int i = 0; i < isPrintArray2D.length; i++) {
				for (int j = 0; j < isPrintArray2D[0].length; j++) {
					System.out.print(isPrintArray2D[i][j]+"\t");
				}
				System.out.print("\n");
			}
		}

		private static void array2D(int[][] array2D) {
			for (int i = 0; i < array2D.length; i++) {
				for (int j = 0; j < array2D[0].length; j++) {
					array2D[i][j] = (int)(Math.random()*50+1);
				}
			}
		}
		
		public static int readInt() {
			Scanner input = new Scanner(System.in);
			int n;
			
			do {
				System.out.println("Enter the nubmer between 1 and 10");
				while(!input.hasNextInt()) {
					System.out.println("That  isn't a number ");
					input.next();
				}
				n = input.nextInt();
			}while(n<1 || n >10);
			return n;
		}

	}

