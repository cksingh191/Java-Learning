package Java_Learning;

public class LargestAndSmallestInterger {

	public static void main(String[] args) {
		int numbers[]= {-100,-10,24,50,-88,987656};
		int largest=0;
		int smallest=0;
		for(int i=1;i<=numbers.length-1;i++) {
			if(numbers[i]>largest) {
				largest= numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest=numbers[i];
				
			}
		}
		System.out.println("\n Given Array is::");
		System.out.println("Largest Number is::"+largest);
		System.out.println("Smallest Number is::"+smallest);

	}

}
