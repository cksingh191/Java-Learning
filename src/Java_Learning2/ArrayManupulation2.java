package Java_Learning2;

public class ArrayManupulation2 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,1,0,0,0,0,1,1,1,0,0};
		for(int a1:arr) {
			if(a1==1) {
				System.out.println(a1);
			}
		}
		for(int a1:arr) {
			if(a1==0) {
				System.out.println(a1);
			}
		}
		

	}

}
