package   basicfromscratch;
public class swap2numbers {
	public static void main(String agrs[]) {
		int a=5;
		int b=6;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
		b=a+b-(a=b);
		System.out.println(a+" "+b); 
		
	}

}
