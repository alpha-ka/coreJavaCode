package programs;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] s={{1,0,0},{8,-9,-1}};
		int sum=0;
		int r=s.length;
		System.out.println(r);
		int c=s[0].length;
		System.out.println(c);
	for (int i = 0; i <r; i++) {
		for (int k = 0; k <c; k++) {
			
		
		sum+=s[i][k];
		}
	}
	System.out.println(sum);
	}		
}