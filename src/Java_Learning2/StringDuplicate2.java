package Java_Learning2;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicate2 {

	public static void main(String[] args) {
		
		String str1="java is best in java it is from other laguages java 22 22";
		
		String[] words=str1.split(" ");
		 Map<String,Integer> mp=new HashMap<String,Integer>();
		  for(String word:words) {
			  Integer count=mp.get(word);
			  if(count==null) {
				  mp.put(word, 1);
			  }else {
				  mp.put(word, ++count);
			  }
			  
			  }
		  
		  for(Map.Entry<String, Integer> m:mp.entrySet()) {
			  if(m.getValue()>1) {
				  System.out.println(m.getKey()+" : "+m.getValue());
			  }
		  }

	}

}
