package programs;

public class spiltdiif {
	static char[] ch;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] s={"practice","wannacry","developer"};

for(int k=0;k<s.length;k++)
{String s1="";
String r="";
for(int i=0;i<s[k].length();i++)
	{
		if(s[k].charAt(i)=='a'||s[k].charAt(i)=='e'||s[k].charAt(i)=='i'||s[k].charAt(i)=='o'||s[k].charAt(i)=='u')
			{s1=s1+s[k].charAt(i);
			}
		}
for(int i=s1.length()-1;i>=0;i--){
	r=r+s1.charAt(i);
	}
int j=0;
for(int i=0;i<s[k].length();i++)
{		if(s[k].charAt(i)=='a'||s[k].charAt(i)=='e'||s[k].charAt(i)=='i'||s[k].charAt(i)=='o'||s[k].charAt(i)=='u')

{System.out.print(r.charAt(j));
++j;}
else{
	System.out.print(s[k].charAt(i));
}}
System.out.println("");
}
	}	
}



	
	

