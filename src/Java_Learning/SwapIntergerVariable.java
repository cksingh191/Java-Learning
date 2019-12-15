package Java_Learning;

public class SwapIntergerVariable {

	public static void main(String[] args) {
		int x=5;
		int y=10;
		System.out.println("Before Swapout X="+x+"  Y="+y);
		
		//By using Third Variable
		
	/*	int t=x;
		x=y;
		y=t;
		System.out.println("Vlaue of X::"+x+"\nValue of Y::"+y);*/
		//Without Third variable
	/*	  x=x+y;
		  y=x-y;
		  x=x-y;*/
		
//		   x=x*y;
//		   y=x/y;
//		   x=x/y;
//		  
//		  System.out.println("Vlaue of X::"+x+"\nValue of Y::"+y);
		
		x=x^y;
		y=x^y;
		x=x^y;
		System.out.println("X=="+x+"Y=="+y);

	}

}
