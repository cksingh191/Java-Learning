package Java_Learning;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicatElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names= {"Java", "JavScript","C","Python","Java","Java","Python","Python","20","20","20"};
		Map<String,Integer> store=new HashMap<String,Integer>();
		for(String name:names) {
			Integer count=store.get(name);
			System.out.println(count);
			if(count==null) {
				store.put(name, 1);
			}else {
				store.put(name, ++count);
			}
			}
		Set <Entry<String,Integer>> entrySet=store.entrySet();
		for(Entry<String,Integer>  entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println("Duplicate Element is::"+entry.getKey()+"=="+entry.getValue());
			}
		}
	}

}
