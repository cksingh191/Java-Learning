package Java_Learning2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  ArrayList<String> al=new ArrayList<String>();  
		  al.add("Ravi");  
		  al.add("Vijay");  
		  al.add("Ravi");  
		  al.add("Ajay");  
		   //Traversing list through for-each loop  
		  for(String obj:al) { 
		    System.out.println(obj);  
		 } 
		  
		  System.out.println("Traversing list through List Iterator:");  
          //Here, element iterates in reverse order  
             ListIterator<String> list1=al.listIterator(al.size()); 
             System.out.println("======="+list1.hasPrevious());
             
             while(list1.hasPrevious())  
             {  
                 String str=list1.previous();  
                 System.out.println(str);  
             } 
             
             System.out.println("Traversing list through for loop:");  
             for(int i=0;i<al.size();i++)  
             {  
              System.out.println(al.get(i));     
             } 
             
             System.out.println("Traversing list through forEach() method:");  
             //The forEach() method is a new feature, introduced in Java 8.  
                 al.forEach(a->{ //Here, we are using lambda expression  
                     System.out.println(a);  
                   }); 
                 
                 System.out.println("Traversing list through forEachRemaining() method:");  
                 Iterator<String> itr=al.iterator();  
                 itr.forEachRemaining(a-> //Here, we are using lambda expression  
                 {  
               System.out.println(a);  
                 }); 
		

	}

}
