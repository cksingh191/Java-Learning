package Java_Learning;

public class SwapStringVariable {

	public static void main(String[] args) {
		String a="Hello";
		String b="World";
		System.out.println("Before Swap\nA==" +a+"\nB=="+b);
		a=a+b; //HelloWorld
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After Swap\nA==" +a+"\nB=="+b);

	}

}
