package programs;

public class splitabc123 {

	public static void main(String[] args) {
		String s="abcdefghi123322";
		String[] str=s.split("(?<=\\G.{3})");
		for(String s1:str)
		{System.out.println(s1);}
		 s="abcdefghi123322adcc2333";
		String[] str1=s.split("\\d+");
		for(String s1:str1)
		{System.out.println(s1);}
		String[] str2=s.split("\\D+");
		for(String s1:str2)
		{System.out.println(s1);}
	}

}
