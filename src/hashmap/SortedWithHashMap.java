package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedWithHashMap {

	public static void main(String[] args) {

    HashMap<Integer, String> hash = new HashMap<>();
    hash.put(1, "dd");
    hash.put(2, "gg");
    hash.put(3, "ff");
    hash.put(4, "ss");
    		
    
//    Map<String, Integer> sortedByPrice = hash.entrySet() 
//    		.stream() 
//    		.sorted(Map.Entry.<String, Integer>comparingByValue()) 
//    		.collect(Collectors.toMap(e -> e.getKey(),e -> e.getValue()));

    

	}
}
