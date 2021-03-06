package Strategy;

public class InsertionSort implements Strategy{
	public void sort (int[] numbers) {
		int n = numbers.length;  
        for (int j = 1; j < n; j++) {  
            int key = numbers[j];  
            int i = j-1;  
            while ( (i > -1) && ( numbers [i] > key ) ) {  
                numbers [i+1] = numbers [i];  
                i--;  
            }  
            numbers[i+1] = key;  
        }  
	}

}
