package Java_Learning2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayManupulation {

	public static void main(String[] args) {
		
		int[] arr= {1,1,1,1,0,0,0,0,1,1,1,0,0};
		ArrayList<Integer> al1=new ArrayList<Integer>();
		ArrayList<Integer> al0=new ArrayList<Integer>();
		
	/*	for(int a:arr) {
			if(a==1) {
				al1.add(a);
			}
			else {
				al0.add(a);
				
			}
				
			
		}
		al1.addAll(al0);
		for(int a1:al1) {
			System.out.println(a1);
		}
		System.out.println(Arrays.toString(arr));*/
		int arr1[]=new int[10];
		for(int a:arr) {
			if(a==1) {
				arr1[0]=a;
			}
			
		}

	}

}
