package Interview;

public class Oneto100WithOutLoop {
	
	static void printnos(int i)
	{
		if(i>0)
		{
			printnos(i-1);
			System.out.println(i);
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			printnos(100);
	}

}



 