package oop0210;

public class firstAtask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numerator =1;
		int denominator=1;
		double pi=0;
		
		for (int i=0; i<=1000; i++) {
				
			if(i%2==1) {
					pi+=(double) numerator/denominator;
			}else {
				pi -=(double) numerator / denominator;
			}
			denominator += 2;
		}
		
		System.out.println("PI: " +(-4*pi));
	}

}
