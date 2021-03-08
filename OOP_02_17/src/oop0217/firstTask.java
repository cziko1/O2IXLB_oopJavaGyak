package oop0217;

public class firstTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double e_num=0;
		
		
		for(int i=0; i<=10;i++) {
			e_num+=(double)1/factor(i);
		}
		System.out.println("The e number: "+e_num);
	}
	public static int factor(int szam) {
		int fact=1;
		
		
		while(szam>0) {
			fact *=szam;
			szam--;
		}
		
		return fact;
	}

}