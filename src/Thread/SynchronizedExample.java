package Thread;

class  Counter
{
	static int count=0;
	
	static synchronized void increment()
	{
		count++;
	}

}



public class SynchronizedExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	 
		
		Thread th1=new Thread( () -> 
		{
			for(int i=0;i<1000;i++)
			{
				Counter.increment();
			
				
			}
			
		});
		Thread th2=new Thread(() -> 
		{
			for(int i=0;i<1000;i++)
			{
				Counter.increment();
			
				
			}
			
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println("Completed " +Counter.count );
		
		
		
		
		
	}

}
