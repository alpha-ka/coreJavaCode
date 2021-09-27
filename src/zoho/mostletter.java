package zoho;

import java.util.Arrays;
import java.util.Scanner;

public class mostletter {
	static char[] ch = new char[2];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any name:");
		String s1 = scan.next();
		int max = 0, l = 0;
		int n = s1.length();
		String s2 = s1;
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			int k = 0;
			for (int j = 0; j < n; j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					++k;
				}
			}
			a[l] = k;
			if (a[l] > max) {
				max = a[l];
			}
			++l;
		}
		l = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if ((s2.charAt(i) == s2.charAt(j)) && (a[i] == max) && (i != j)) {
					s2 = s2.replace(s2.charAt(j), '0');
				} else if ((s2.charAt(i) == s2.charAt(j)) && (a[i] == max)
						&& (s2.charAt(j) != '0')) {
					ch[l] = s2.charAt(j);
					++l;
				}
			}
		}
		System.out.println(s2);
		int x = s1.lastIndexOf(ch[0]);
		int y = s1.lastIndexOf(ch[1]);
		if (l == 2&&x > y) {
		System.out.println(ch.length);
		System.out.println(Arrays.toString(ch));
		System.out.println(s1.charAt(y) + "," + max + "times");
			}
		else {
			System.out.println(s1.charAt(x) + "," + max + "times");
		}

	}
}
