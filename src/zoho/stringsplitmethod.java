package zoho;

public class stringsplitmethod {
	static String splt[] = new String[100];
	static int k = 0;

	static void slt(String s) {
		k=0;
		int m = s.length();
		splt[k] = "";
		for (int i = 0; i < m; i++) {
			if ((s.charAt(i)) == ' ') {
				++k;
				splt[k] = "";
			} else {
				splt[k] = splt[k] + s.charAt(i);
			}}	}
	static String join(String[] str1) {
		String s = "";
		for (int i = 0; i <= k; i++) {
			if (str1[i] == "") {
				continue;}
			s = s + str1[i] + " ";
		}
		k = 0;
		return s;	}
	public static void main(String[] args) {
		System.out.println("ZOHO Interview Question my own program");
		String str = "hi! you are alpha no.1 right";
		String str1 = "yes i'm alpha no.1 so what";
		String str2[] = new String[100];
		String str3[] = new String[100];
		String samestring[] = new String[100];
		int s2, s3, j;
		slt(str);
		str2 = splt.clone();
		s2 = k;
		for (int i = 0; i <= s2; i++) {
			System.out.print(str2[i] + " ");	}
		System.out.println("");
		slt(str1);
		str3 = splt.clone();
		s3 = k;
		for (int i = 0; i <= s3; i++) {
			System.out.print(str3[i] + " ");}
		System.out.println("\nFinding same word in both Sentence and remove");
	   k=0;
		for (int i = 0; i <= s2; i++) {
			for (int l = 0; l <= s3; l++) {
				if (str3[i].equals(str2[l])) {
			str = str.replace(str2[i], "");
			str1 = str1.replace(str3[i], "");
		}}}
		slt(str);
		str = join(splt);
		System.out.println(str);
		slt(str1);
		str1 = join(splt);
		System.out.println(str1);
	}}