package Java_Learning2;

import java.util.HashMap;
import java.util.Map;

public class Duplicate {

	public static void main(String[] args) {
		
		String [] names= {"Java","JavaScript","Python","Java","C","Python"};
		
		Map<String,Integer> store=new HashMap<String,Integer>();
		 for(String name:names) {
			 Integer count=store.get(name);
			 if(count==null) {
				 store.put(name, 1);
			 } else {
				 store.put(name, ++count);
			 }
		 }
		 for(Map.Entry<String, Integer> m:store.entrySet()) {
			 if(m.getValue()>1) {
				 System.out.println("Duplicate Element is:"+m.getKey());
			 }
		 }
		 System.out.println(store);
		 for(Map.Entry<String, Integer> m:store.entrySet()) {
			 System.out.println("Key :"+m.getKey()+" "+" Value :"+m.getValue());
		 }

	}

}
