package Java_Learning2;

import java.util.HashMap;
import java.util.Map;

public class RemoveStringDuplicateWord2 {

	public static void main(String[] args) {
		findDuplicateWords("Hey java is java bestlanguage is java");

	}
	
	public static void findDuplicateWords(String InputString) {
		String words[]=InputString.split(" ");
		
		Map<String,Integer> wordCount=new HashMap<String, Integer>();
		
		for(String word:words) {
			Integer count=wordCount.get(word);
			if(count==null) {
				wordCount.put(word, 1);
			} else {
				
				wordCount.put(word, ++count);	
			}
		}
		for(Map.Entry<String, Integer> m:wordCount.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey() +" : "+m.getValue());
			}
		}
	}

}
