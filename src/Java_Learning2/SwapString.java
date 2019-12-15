package Java_Learning2;

public class SwapString {

	public static void main(String[] args) {
		
		String a="Helloll";
		String b="India";
		a=a+b; //HelloIndia
		b=a.substring(0, a.length()-b.length()); //0 ,10-5==0,5 hello
		System.out.println(a.length()-b.length());
		a=a.substring(b.length());//5
		
		
		System.out.println(b.length());
		System.out.println("A :"+a);
		System.out.println("B :"+b);

	}

}
