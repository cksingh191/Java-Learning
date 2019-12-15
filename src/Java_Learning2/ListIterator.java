package Java_Learning2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListIterator {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<String>();
		
		list.add("Shiva");
		list.add("Ram");
		list.add("Praveen");
		list.add("Chandra");
		list.add("Aaryan");
		list.add("Sony");
		list.add("Praveen");
		list.add("Chandra");
		System.out.println(list);
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	/*	for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))){
					System.out.println("Duplicate Element is:"+list.get(i));
					
				}
			}
		}*/
		
		Set<String> set=new HashSet<String>();
		for(String name:list) {
			if(set.add(name)==false) {
				System.out.println("Duplicate Element is :"+name);
			}
		}

	}

}
