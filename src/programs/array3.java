package programs;

import java.util.Arrays;

public class array3 {

	public static void main(String[] args) {
		float arr[] = { 2.64f, 67.3f, 3.41f, 45.44f, 55.64f };
		int n = arr.length;
		float temp;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(arr));

	}

}
