package Java_Learning;

import java.util.HashMap;
import java.util.Map;

public class MapIteretor {

	public static void main(String[] args) {
		Map<String,Integer> items=new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		
		for(Map.Entry<String, Integer> entry:items.entrySet()) {
			System.out.println("Item: "+entry.getKey()+"  Count: "+entry.getValue());
		}

	}

}
