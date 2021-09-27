package programs;
public class splitstring {
	public static void main(String[] args) {
		String str="143-836736";
		String[] str1=str.split("-");
		for(String s:str1)
		{System.out.println(s);}
String[] str3="geek@geeks@da".split("@",2);
		
		for(int i=0;i<str3.length;i++)
		{
			System.out.println(str3[i]);
		}
		 str="alpha@alpha@007";
		str1=str.split("@",1);
		for(String s:str1)
		{System.out.println(s);}
		str="alpha@alpha@007";
		String[] str2=str.split("@",2);
		for(String s:str2)
		{	System.out.println(s);}
	str="alpha@alpha@007";
		str1=str.split("@",5);
		for(String s:str1)
		{System.out.println(s);}
		str="alpha@alpha@007";
		str1=str.split("@",-2);
		for(String s:str1)
		{System.out.println(s);	}	
		str="alpha@alpha@007";
		str1=str.split("@",0);
		for(String s:str1)
		{		System.out.println(s);}
		str="alpha@alpha@007";
		str1=str.split("a",4);
		for(String s:str1)
		{System.out.println(s);}
		str="alpha@alpha@007";
		str1=str.split("a",5);
		for(String s:str1)
		{System.out.println(s);}
	}
}
