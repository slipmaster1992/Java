package recoursin;

public class ReverseString {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer();
		s.append("alexxis");
		System.out.println(s);
		s.reverse();
		System.out.println(s);
		
		System.out.println(reverse("alex"));
		

	}

	public static String reverse(String source){
        if(source == null || source.isEmpty()){
            return source;
        }       
        String reverse = "";
        for(int i = source.length() - 1; i>=0; i--){
            reverse = reverse + source.charAt(i);
        }
      
        return reverse;
    }
    
	
}
