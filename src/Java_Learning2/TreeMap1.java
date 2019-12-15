package Java_Learning2;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap1 {

	public static void main(String[] args) {
		
		TreeMap<String,Integer> list=new TreeMap<String,Integer>();
		
		list.put("Shiva",101);
		list.put("Ram",101);
		list.put("Praveen",102);
		list.put("Chandra",103);
		list.put("Aaryan",104);
		list.put("Sony",105);
		list.put("Praveen",106);
		list.put("Chandra",107);
		
		System.out.println(list);
		for(Map.Entry m:list.entrySet()) {
			System.out.println("Key :"+m.getKey()+" "+" Value :"+m.getValue());
			
		}
		

	}

}
