package het3;

import java.util.*;

public class firstTask {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char answer;

		do {
			/**int a = readInt();
			System.out.println("Enter the operator: ");
			char op = input.next().charAt(0);
			int b = readInt();
			*/
 						
			System.out.println("Enter the operation:");
			String in = input.nextLine();
			String[] array = in.split(" ");
			
			
			int a = Integer.parseInt(array[0]); 
			char op = array[1].charAt(0); 
			int b = Integer.parseInt(array[2]); 			
			
			double c = 0.0;
			boolean ok = true;
			
			switch (op) {
				case '+':
					c = a + b;
					break;
	
				case '-':
					c = a - b;
					break;
	
				case '*':
					c = a * b;
					break;
	
				case '/':
					if (b != 0) {
						c = (double) a / b;
						break;
					} else {
						System.out.println("Cannot divide woth ZER0!");
						ok = false;
						break;
					}
	
				default:
					System.out.println("Couldn't defin oparation");
					ok = false;
				}

			if (ok)
				System.out.println("Eredmeny: " + a + " " + op + " " + b + " = " + c);

			System.out.println("Would You Like to continue?");
			answer = input.next().charAt(0);
			input.nextLine();
		} while (answer == 'i' || answer == 'I');

	}
	
	

	public static int readInt() {
		Scanner input = new Scanner(System.in);
		int n;

		System.out.println("Enter a number: ");

		while (!input.hasNextInt()) {
			System.out.println("That's not a number");
			input.next();
		}
		n = input.nextInt();

		return n;
	}

}