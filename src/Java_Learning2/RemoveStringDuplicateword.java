package Java_Learning2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class RemoveStringDuplicateword {

	public static void main(String[] args) {
		
		findDuplicateWords("Hey java is java bestlanguage is java not is not");

	}
	
	public static void findDuplicateWords(String InputString) {
		
		String words[]=InputString.split(" ");
		
		Map<String,Integer> wordCount=new HashMap<String,Integer>();
		for(String word:words) {
			if(wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word)+1);
			} else {
				wordCount.put(word, 1);
			}
		}
		System.out.println(wordCount);
	/*	Set<String> wordInString=wordCount.keySet();
		for(String word:wordInString) {
			if(wordCount.get(word)>1) {
				System.out.println(word+" : "+wordCount.get(word));
			}
		}*/
		
		for(Map.Entry<String,Integer> m:wordCount.entrySet()) {
			if(m.getValue()>1) {
				System.out.println(m.getKey()+" : "+m.getValue());
				
			}
		}
	}

}
