package Java_Learning;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListConcept {

	public static void main(String[] args) {
		ArrayList<String> ar=new ArrayList<String>();
	/*	ar.add(10);
		ar.add(20);
		ar.add(30);
		ar.add(20);*/
		ar.add("Java");
		ar.add("Java1");
		ar.add("Java");
		System.out.println(ar.size());
		Set set=new HashSet();
//		for(int i=0;i<ar.size();i++) {
//			if(!set.add(ar.get(i))) {
//				System.out.println("Dulicate::"+ar.get(i));
//			}
//		}
		for(String ar1:ar) {
			if(set.add(ar1)==false) {
				System.out.println("Dulicate "+ar1);
			} 
			
		}
		System.out.println(ar);
		System.out.println(set);
			
			
		}

	}


