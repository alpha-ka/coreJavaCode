package programs;

public class Strings {
	public static void main(String[] args) {
		final String str = new String("java");// new keyword
		String str1 = "Programming Language";
		String str2 = "JAVA", str3 = "       hi     ";// literal keyword
		System.out.println(str2.isEmpty());
		System.out.println(str.length());
		System.out.println(str.charAt(3));
		System.out.println(str.contains("ja"));
		System.out.println(str.concat(" is a" + str1));
		// str=str1; it will generate error bcos of final keyword
		System.out.println(str);
		System.out.println(str.startsWith("Ja"));
		System.out.println(str.endsWith("va"));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.substring(2));
		System.out.println(str.substring(1, 4));// 1->startindex 4->endindex-1=3
												// so 1-3
		System.out.println(str3.trim() + " " + str);// trim ignores space
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		for (char c : ch) {
			System.out.print(c);
		}
		str3 = "JAVA";
		System.out.println("\n" + str
				+ str1.replace(str1, " is a Programming language"));
		System.out.println(str.equals(str2));// checks equals with case
		System.out.println(str.equalsIgnoreCase(str2));// checks equals ignores
														// case
		System.out.println(str2 == str3);// checks equals with case
		str3 = "JAVAJAVA";
		System.out.println(str3.replaceFirst("VA", "lpha "));
		System.out.println(str3.replaceAll("VA", "lpha "));
		System.out.println(str3.replace('A', 'l'));
		System.out.println(str3.codePointAt(1));// print unicode
		System.out.println(str3.codePointBefore(3));// print unicode
		System.out.println(str3.codePointCount(1, 4));
		System.out.println(str3.contentEquals(str2 + str2));
		System.out.println(str3.matches(str2 + str2));
	}
}
