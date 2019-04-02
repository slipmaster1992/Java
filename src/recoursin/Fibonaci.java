package recoursin;

public class Fibonaci {

public static void main(String[]args) {
		
		
		
		System.out.println(fibonaci(100));
		
		
	}
	
	public static long fibonaci(int i) {
		
		
		if(i==0) return 0;
		if(i<=2) return 1;
		
		long fibNum = fibonaci(i - 1) + fibonaci(i - 2);
		
		return fibNum;
		
		
		
		
		
		
	}
	
}
