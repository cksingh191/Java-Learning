package Java_Learning2;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("Shiva");
		ts.add("Vijay");
		ts.add("Raj");
		ts.add("Aman");
		
		Iterator itr=ts.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ts.descendingSet());

	}

}
