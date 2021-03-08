package oop0217;

import java.util.*;


public class fifthTask {
	
    public static void main(String[] args) {
    	
    	Scanner input = new Scanner (System.in);
    	
    	int n1 = isNumber1();
    	int n2 = isNumber2();
    	int n3 = isNumber3();
    	int n4 = isNumber4();
    	int n5 = isNumber5();
    	
    	
    	String[][] emailAdd = new String[5][];
    	
    	/**emailAdd[0]= new String[n1];
    	emailAdd[1]= new String[n2];
    	emailAdd[2]= new String[n3];
    	emailAdd[3]= new String[n4];
    	emailAdd[4]= new String[n5];
    	*/
    	int size = n1+n2+n3+n4+n5;
    	
    	
    	for (int i = 0; i < emailAdd.length; i++) {
    		
    		for (int j = 0; j < size; j++) {
				System.out.println("Enter your name: ");
				emailAdd[i][j] = input.next();
			}
    	}
    	

    }
    
    
    public static int isNumber1() {
    	Scanner input = new Scanner(System.in);
    	
    	int n;
    	
    	do {
    		while(!input.hasNextInt()) {
    			System.out.println("That isn't a number");
    			input.next();
    		}
    		n=input.nextInt();
    	}while(n<0 || n>3);
    	
    	return n; 
    }
    
    public static int isNumber2(){
    	Scanner input = new Scanner(System.in);
    	
    	int n;
    	
    	do {
    		while(!input.hasNextInt()) {
    			System.out.println("That isn't a number!!!");
    			input.next();
    		}
    		
    		n=input.nextInt();
    	}while(n<0 || n>3);
    	return n;
    }
    
    public static int isNumber3() {
    	Scanner input = new Scanner(System.in);
    	int n;
    	
    	do {
    		while(!input.hasNextInt()) {
    			System.out.println("That isn't a number");
    			input.next();
    		}
    		n=input.nextInt();
    	}while(n<0 || n>3);
    	
    	return n;
    }
    
    public static int isNumber4() {

    	Scanner input = new Scanner(System.in);
    	
    	int n;
    	
    	do{
    		while(!input.hasNextInt()) {
    			System.out.println("That isn't a number!!!");
    			input.next();
    		}
    		
    		n=input.nextInt();
    	}while(n<0 || n>3);
    	
    	return n;
    }
    
    public static int isNumber5() {
    	Scanner input = new Scanner(System.in);
    	int n;
    	
    	do {
    		while(!input.hasNextInt()) {
    			System.out.println("That isn't a number!!!");
    			input.next();
    		}
    		n=input.nextInt();
    	}while(n<0 || n>3);
    	
    	return n;
    }

}

