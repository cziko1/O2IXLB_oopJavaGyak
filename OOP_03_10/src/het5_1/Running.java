package het5_1;

import java.util.Scanner;

public class Running {
	public static void main(String[] args) {
		rectangle rectangleArray[] = new rectangle[10];
		
		upLoad(rectangleArray);
		print(rectangleArray);
		
		rectangle t;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("New rectangle");
		System.out.println("Enter the A side");
		int a = scan.nextInt();
		System.out.println("Enter the B side");
		int b = scan.nextInt();
		
		t = new rectangle(a,b);
		System.out.println(t);
		
		System.out.println("How many rectangel have been bigger than it : "+getBiggerArea(rectangleArray, t));
		
		if(getSameData(rectangleArray, t) != -1) {
			System.out.println("These are same data!\tIndex: "+getSameData(rectangleArray, t));
		}else {
			System.out.println("These're not same");
		}
		
		
		
	}
	public static void upLoad(rectangle[] rectangleArray) {
		for (int i = 0; i < rectangleArray.length; i++) {
			rectangleArray[i] = new rectangle((int) (Math.random()*9+2), (int)(Math.random()*9+2));
		}
	}
	public static void print(rectangle[] rectangleArray) {
		for (int i = 0; i < rectangleArray.length; i++) {
			System.out.println(rectangleArray[i]);
		}
	}
	private static rectangle theSmallestarea(rectangle[] array) {
		rectangle min = array[0];
		for (rectangle rectangle : array) {
			if(rectangle.getArea() < min.getArea()) {
				min = rectangle;
			}
		}
		return min;
	}
	public static int getBiggerArea(rectangle[] array, rectangle t) {
		int db = 0;
		for (rectangle rectangle : array) {
			if(rectangle.getArea() > t.getArea()) {
				db++;
			}
		}
		return db;
	}
	public static int getSameData(rectangle[] array, rectangle t) {
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if(array[i].getAreTheseSidesSame(t)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
}
