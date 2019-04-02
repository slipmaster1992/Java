package recoursin;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String[]args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter elements size");
		
		int num = s.nextInt();
		
		int arr[] = new int[num];
		
		System.out.println("Enter Array Values");
		
		
		for(int i=0; i<num;i++) {
		
		arr[i] = s.nextInt();
		}
		
		System.out.println("reverse: ");
		
		for (int i =arr.length - 1; i>0 ;i--) {
			System.out.println(arr[i]);
			
		}
		
		
		}
}
