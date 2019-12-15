package Java_Learning;

public class PairCountInArray {

	public static void main(String[] args) {
		
		PairCountInArray pair=new PairCountInArray();
		pair.getPairsCount(int arr[] = {1, 5, 7, -1}, 2, 6);

	}
	// Returns number of pairs in arr[0..n-1] with sum equal 
	// to 'sum' 
	int getPairsCount(int arr[], int n, int sum) 
	{ 
	    int count = 0; // Initialize result 
	  
	    // Consider all possible pairs and check their sums 
	    for (int i=0; i<n; i++) 
	        for (int j=i+1; j<n; j++) 
	            if (arr[i]+arr[j] == sum) 
	                count++; 
	  
	    return count; 
	}

}
