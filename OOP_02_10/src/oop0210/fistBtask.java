package oop0210;

public class fistBtask {

	public static void main(String[] args) {
		double numerator =0;
		double denominator;
		double pi=1;
		
		for (int i=0; i<=1000; i++) {
			denominator=numerator+1;
			if(i%2==0) {
				numerator+=2;
			}
			pi*=numerator/denominator;
		}
		
		System.out.println("PI: " +(pi*2));
	}

}