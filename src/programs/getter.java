package programs;

import java.util.Arrays;

public class getter {

	public static void main(String[] args) {
String s="allow";
	char[] ch=new char[]{'r','u','p','h','a'};
	System.out.println(String.valueOf(ch));
s.getChars(0, 2, ch,0);
	System.out.println(ch);
byte[] b=s.getBytes();
for (byte b1 : b) {
	System.out.print(b1+" ");
}
System.out.println("\n"+Arrays.toString(b));
System.out.println(s.regionMatches(0,"lustallow",4,5));
	}
	
	
}
