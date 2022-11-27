package week1Day3;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 7, 6, 8 };
		

		// SORTING LOGIC STARTS
		for (int i = 0; i <= arr.length; i++)

		{
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
				}
			}
		}
		// SORTING LOGIC ENDS
		
		System.out.print("\n  The sorted array is : ");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("  " + arr[i]);
		}

		
		// FINDING MISSING NUMBER STARTS HERE
		for (int i = 1; i < arr.length; i++) {
				if(arr[i] != 1 + arr[i-1]) {
					int j = i+1;
					System.out.println("\n\n  The missing number in the array is : " + j );
			}
		}
		// FINDING MISSING NUMBER ENDS HERE

	}
	
	
}
