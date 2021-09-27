package programs;

public class strtoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="c2e3f4";
		int t=str.length(),c=0;
		int n=Character.getNumericValue(str.charAt(1));
		System.out.println(n);
		n=str.charAt(3)-'0';
		System.out.println(n);
		String s=""+str.charAt(5);
		c=Integer.parseInt(s);
		System.out.println(c);
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
	//or if(str.charAt(i)<'9' && str.charAt(i)>'0')
					{ s=""+str.charAt(i);
				c=Integer.parseInt(s);
				n=i-1;
				for(int j=0;j<c;j++)
				{
				System.out.println(str.charAt(n));		
				}
				}	
			}	
	}
}
