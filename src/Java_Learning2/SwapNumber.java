package Java_Learning2;

public class SwapNumber {

	public static void main(String[] args) {
		
		int a=5;
		int b=10;
	/*	int t=a;
		a=b;
		b=t;*/
		
	/*	a=a+b;  //15
		b=a-b; //15-10=5
		a=a-b; //10-5=10
*/		
	/*	a=a*b;  //50
		b=a/b; //50/10=5
		a=a/b;  //50/5=10
*/		
		a=a^b;
		b=a^b;
		a=a^b;
		
		
		
		System.out.println("A :"+a);
		System.out.println("B :"+b);

	}

}
