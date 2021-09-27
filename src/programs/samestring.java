package programs;

public class samestring {
	public static void main(String[] args) {
		System.out.println("ZOHO Interview Question my own program");
		String str = "hi! you are alpha no.1 right";
		String str1 = "yes i'm alpha no.1 so what";
		int j = 0, z = 0;
		String str2[] = new String[100];
		String str3[] = new String[100];
		String samestring[] = new String[100];
		int m = str.length(), n = str1.length();
		str2[j] = "";
		for (int i = 0; i < m; i++) {
			if ((str.charAt(i)) == ' ') {
				++j;
				str2[j] = "";
			} else {
				str2[j] = str2[j] + str.charAt(i);
			}
		}
		for (int i = 0; i <= j; i++) {
			System.out.print(" " + str2[i]);
		}
		System.out.println("");
		int k = j;
		j = 0;
		str3[j] = "";
		for (int i = 0; i < n; i++) {
			if ((str1.charAt(i)) == ' ') {
				++j;
				str3[j] = "";
		}
			else {
				str3[j] = str3[j] + str1.charAt(i);
			}}
		for (int i = 0; i <= k; i++) {
			System.out.print(" " + str3[i]);}
		System.out.println("\nFinding same word in both Sentence");
		for (int i = 0; i <= j; i++) {
			for (int l = 0; l <= k; l++) {
				if (str2[i].equals(str3[l])) {
					samestring[z] = str2[i];
					System.out.print(samestring[z] + " ");
					++z;
					}}}
		System.out.println("\nRemoving same word in both Sentence");
		for (int i = 0; i < z; i++) {
			str = str.replace(samestring[i], "");
			str1 = str1.replace(samestring[i], "");}
		System.out.println(str);
		System.out.println(str1);
	}}
