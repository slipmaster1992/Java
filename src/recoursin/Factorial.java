package recoursin;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		int num, fac = 1;
		
		Scanner s  = new Scanner(System.in);
		System.out.println("enter number");
		
		num = s.nextInt();
		
		 
			
			for(int i = 1; i <= num; i++ ) {
				
				
				fac *= i;
			   
			}
			
			System.out.println(fac);
			
		
		
		
		
		
		
		
		
//     System.out.println(factorial(5));

	}

	
	
	public static int factorial(int number) {
		
		
		if(number == 0) {
			
			return 1;
		}
		
		return number * factorial(number - 1);
		
		
	}

	
	
	
	
}
