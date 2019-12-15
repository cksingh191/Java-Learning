package Java_Learning;

import java.util.Hashtable;

public class DulicateElement2 {

	public static void main(String[] args) {
	  
		Hashtable h=new Hashtable();
		h.put("A", 100);
		h.put("B", 200);
		h.put(100, 500);
		
		System.out.println(h.size());
		System.out.println(h.get("A"));

	}

}
