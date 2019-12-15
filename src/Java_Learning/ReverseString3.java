package Java_Learning;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ReverseString3 {
	 public static void main(String[] args) {
		//String manupulation
		 
		 /*String s="Selenium";
		 StringBuffer sb=new StringBuffer(s);
		 System.out.println(sb.reverse());*/
		 
		 //Remove Junk character by using Regex[a-zA-Z0-9]
		 
		/* String s="$$##%%$$%%^&&**&*&&^^**())Welcome??>>?><>>?India";
		 s=s.replaceAll("[^a-zA-Z0-9]", "");
		 System.out.println(s);*/
		 
		 //Reverse Integer
		 
		 int num=12345;
		 int rev=0;
		 while(num!=0){
			 rev=rev*10+num%10;
			 num=num/10;

		 }
		 System.out.println(rev);
		 
		 // Reverse Interger By using String Buffer
		 
		 /*int num=12345;
		 StringBuffer sb=new StringBuffer(String.valueOf(num));
		 System.out.println(sb.reverse());*/
		 
		 //Find Missing number
		 
		/* Integer[] a= {1,2,4,5};
		 int sum=0;
		 for(int i=0;i<=a.length-1;i++) {
			 sum=sum+ a[i];
		 }
		 System.out.println(sum);
		 int sum1=0;
		 for(int i=1;i<=5;i++) {
			 sum1=sum1+i;
		 }
		 System.out.println("Missing Number is::" +(sum1-sum));*/
		 
		 //Duplicate Element From an array
		 
		 String[] names= {"Java", "JavScript","C","Python","Java","Java"};
		 for(int i=0;i<=names.length-1;i++) {
			 for(int j=i+1;j<=names.length-1;j++) {
				 if(names[i].equals(names[j])) {
					 System.out.println("Duplicate element is::" +names[i]);
				 }
			 }
		 }
		 //Duplicate Element from an array by using Hash set java collection
	/*	 //String[] names= {"Java", "JavScript","C","Python","Java","Python","Java","Java"};
		 Set<String> store=new HashSet<String>();
		 for(String name:names) {
			 if(store.add(name)==false) {
				 System.out.println("Duplicate element is::" +name);
			 }
		 }*/
//		 Integer[] numbers= {10,20,30,40,10,20};
//		 Set<Integer> store1=new HashSet<Integer>();
//		 for(int number:numbers) {
//			 if(store1.add(number)==false) {
//				 System.out.println("Duplicate element is::" +number	);
//			 }
//		 }
//		 System.out.println(store);
//		 
//		 String name="Chandrashekhar Singh";
//		 String[] nameele=name.split(" ");
//		 System.out.println(Arrays.toString(nameele));
//		 System.out.println(nameele[1]);
//		 for(String nm:nameele) {
//			 if(nm.equals("Singh"));
//			 System.out.println(nm);
//			 
//		 }
//		  
//	 }

	 }
}
