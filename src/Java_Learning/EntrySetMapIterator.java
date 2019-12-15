package Java_Learning;

import java.util.HashMap;
import java.util.Map;

public class EntrySetMapIterator {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("Pitter", 30);
		map.put("John", 32);
		map.put("Anthony", 34);
		map.put("Akbar", 36);
		for(Map.Entry<String, Integer> entry:map.entrySet()) {
			System.out.println("Name "+entry.getKey()+" Age "+entry.getValue());
		}

	}

}
