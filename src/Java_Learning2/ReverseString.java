package Java_Learning2;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Welcome India";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);			
			
		}
		System.out.println("Reverse :"+rev);
		
		
		String[] s1=str.split(" ");
		System.out.println(s1.length);
		for(int i=s1.length-1;i>=0;i--)  {
			System.out.println(s1[i]);
		}
		
		System.out.println(s1[1]+" "+s1[0]);

	}

}
