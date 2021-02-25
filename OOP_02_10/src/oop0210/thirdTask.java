package oop0210;

import java.util.*;

public class thirdTask {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		int[] array = new int[5];
		isScanner(array);
		isPrinter(array);
		isInverse(array);
		isAvarageParity(array);
		isMonotony(array);
		isSort(array);
	}
	public static void isScanner(int[] x) { //Array scan
		Scanner scan=new Scanner(System.in);
		for (int i = 0; i < x.length; i++) {
			x[i]=scan.nextInt();
		}
	}
	public static void isPrinter(int[] x) { //Array prints
		for (int i = 0; i < x.length; i++) {
			System.out.println((i+1)+".Elementes: "+x[i]);
		}
	}
	public static void isInverse(int[] x) { // Inverse
		for(int i = x.length-1;i>=0;i--) {
			System.out.println(x[i]);
		}
	}
	public static void isAvarageParity(int[] x) { //average parity index's elements of Array (inCorrect English)
		int db=0;
		double avg=0.0;
		double sum=0.0;
		for (int i = 0; i < x.length; i++) {
				if(x[i]%2==0) {
					db++;
					sum+=x[i];
				}
			}
		avg=sum/db;
		System.out.println(avg);
	}
	public static void isMonotony(int[] x) { //monotonic Array
		int a=0;
		int b=0;
		int db=0;

		
		for (int i = 0; i < x.length-1; i++) {
			db++;
			if(x[i]<=x[i+1]) {
				a++;
			}else if(x[i]>=x[i+1]){
				b++;
			}else {
			
			}
		}
		if(a%db==0) {
			System.out.println("Monotonic (Growing)");
		}else if(b%db==0) {
			System.out.println("Monotonic (descending)");
		}else {
			System.out.println("This Array isn't Montonic");
		}
	}
	public static void isSort(int[] x) { //Minimum Sorts
			for (int i = 0; i < x.length; i++) {
				int  min_index=i;
				for (int j = i+1; j < x.length; j++) {
					if(x[j]<x[min_index]) {
						min_index = j;
					}
					int temp =x[min_index];
					x[min_index]=x[i];
					x[i]=temp;
				}
				System.out.println("isSort: "+x[i]);
			}
	}
}
