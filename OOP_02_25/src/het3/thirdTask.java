package het3;

import java.util.*;
import static java.lang.Math.sqrt;


public class thirdTask {

	public static void main(String[] args) {
		double discriminant = 0;
		double x1 = 0;
		double x2 = 0;
		int a = 0;
		int b = 0;
		int c = 0;
		boolean ok;
		
		Scanner input = new Scanner(System.in);
		
		
		do {
			System.out.println("The constants of equation separeted by commas: ");
			String inString = input.nextLine();
			String[] strArray = inString.split(",");
			
			ok = true;
			
			try {
				a = Integer.parseInt(strArray[0]);
				b = Integer.parseInt(strArray[1]);
				c = Integer.parseInt(strArray[2]);
			} catch (NumberFormatException ex) {
				System.out.println(ex.getMessage());
				ok = false;
			}
		}while(!ok);
		input.close();
		
		discriminant = getDiscriminant(a,b,c);
		if (discriminant < 0) {
			System.out.println("Don't have a Solution!");
		} else {
			x1 = getCoefficient1(a,b, discriminant);
			x2 = getCoefficient2(a,b, discriminant);

			System.out.println("The Solutions: " + "x1:" + x1 + " x2:" + x2);
		}
	}
	private static double getDiscriminant(int a, int b, int c) {
		return (b * b) - (4 * a * c);
	}
	
	private static double getCoefficient1(int a, int b, double discriminant) {
		return (b * (-1) + sqrt(discriminant)) / (2 * a);
	}
	
	private static double getCoefficient2(int a, int b, double discriminant) {
		return (b * (-1) - sqrt(discriminant)) / (2 * a);
	}

}
