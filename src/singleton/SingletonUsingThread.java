package singleton;

public class SingletonUsingThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				STR obj=STR.getInstance();
				
			}
		});
		
		
		
		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				STR obj=STR.getInstance();
				
			}
		});
		
		
		t1.start();
		t2.start();
		
	}

}
class STR{
	
	static STR obj;
	private STR() {
		System.out.println("Instance of Object Created");
	}
	
	static synchronized STR getInstance()
	{
		if(obj==null)
		obj=new STR();
		
		return obj;
	}
	
}