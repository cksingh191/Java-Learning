package Java_Learning2;

public class LargestElementnArray {

	public static void main(String[] args) {
		
		Integer[] numbers= {10,20,3000,500,-100,-100,1,-500,4000};
		int largest=numbers[0];
		int smallest= numbers[0];
		
		for(int i=1;i<numbers.length;i++) {
			if(numbers[i]>largest) {
				largest=numbers[i];
			}else {
				if(numbers[i]<smallest) {
					smallest=numbers[i];
				}
			}
		}
		System.out.println("Largest :"+largest);
		System.out.println("Smallest :"+smallest);

	}

}
