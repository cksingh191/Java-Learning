package Java_Learning2;

public class SwpaString2 {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="India";
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("A : "+a);
		System.out.println("B : "+b);

	}

}
