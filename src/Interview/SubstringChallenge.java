package Interview;

public class SubstringChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String S="abcabc";
		for(int i = 0;i<S.length();i++)
		{
			String str=null;
			for(int j = i+1;j<=S.length();j++)
			{
				System.out.println(S.substring(i, j));
			 	str=S.substring(i, j);
				if (str.charAt(0)==str.charAt(str.length()-1))
				System.out.println(" search: "+str.charAt(0)+" "+str.charAt(str.length()-1));
				
			}

		}

	}

}
