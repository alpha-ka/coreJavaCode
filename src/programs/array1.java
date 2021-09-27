package programs;

import java.util.Arrays;

public class array1 {

	public static void main(String[] args) {

		int arr1[] = { 2, 3, 8, 4, 5 };
		int arr2[] = { 4, 7, 8, 6 };
		int n1 = arr1.length;
		int n2 = arr2.length;

		int k = 0;
		
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}

		

	}
}
