package programs;

public class parareverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=0;
		String str1 ="Java is a high-level programming language originally developed "
				+ "by Sun Microsystems and released in 1995. Java runs on a variety of"
				+ " platforms, such as Windows, Mac OS, and the various versions of UNIX";
		String str2[]=new String[500];
		int n=str1.length();
		str2[j] ="";
		for (int i = 0; i < n; i++) {
			if ((str1.charAt(i)) == ' ') {	
				++j;
				str2[j]="";
			
			} else {
				str2[j] = str2[j] + str1.charAt(i);
			}		}
		System.out.println(j);
		for(int i=0;i<=j;i++)
		{System.out.print(" "+str2[i]);}
		System.out.println("");
		for(int i=j;i>=0;i--)
		{System.out.print(" "+str2[i]);}
		String[] str3=str1.split("\\s");
		System.out.println("");
		for(int i=0;i<str3.length;i++)
		{System.out.print(" "+str3[i]);}
		System.out.println("");
		for(int i=str3.length-1;i>=0;i--)
		{System.out.print(" "+str3[i]);}
	
	}
}
