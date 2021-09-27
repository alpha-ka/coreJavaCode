package singleton;

public class SingletonEager {
	public static void main(String [] args)
	{
		
		ABC obj=ABC.getInstance();
		ABC obj2=ABC.getInstance();
		
	}

}

class ABC{
	
	static ABC obj=new ABC();
	private ABC() {
		System.out.println("Instance of Object Created");
	}
	
	static ABC getInstance()
	{
		return obj;
	}
	
}
