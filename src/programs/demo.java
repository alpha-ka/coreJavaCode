package programs;

public class demo {

	public static void main(String[] args) {
	int n;	// TODO Auto-generated method stub
		String[][] g={{"geeksforgeeks"},{"geeksquizgeek"},{"ideqapractice"}};
	String x="geeks";
	int j=0;
	for(int i=0;i<g.length;i++)
	{if(g[i][j].contains(x)){
		System.out.println(i+""+j);}
	}
	String sr="abc123";
	String st1=sr.substring(3);
	System.out.println(st1);
			
	}
	

}
