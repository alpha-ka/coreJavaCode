package Thread;

import java.util.concurrent.atomic.AtomicInteger;

class  Counter3 
{
	//private static int count=0;
	 private static AtomicInteger count=new AtomicInteger();
	
//static synchronized void increment()
//	{
//	    count++;
//	}

static synchronized void increment()
{
	count.getAndIncrement();
}

static int getCount() 
{
	//return count;
	return count.get();
}


}



public class AtomicIntegerExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	 
		
		Thread th1=new Thread( () -> 
		{
			for(int i=0;i<1000;i++)
			{
				Counter3.increment();
			
				
			}
			
		});
		Thread th2=new Thread(() -> 
		{
			for(int i=0;i<1000;i++)
			{
				Counter3.increment();
			
				
			}
			
		});
		th1.start();
		th2.start();
		th1.join();
		th2.join();
		System.out.println("Completed " +Counter3.getCount() );
		
		
		
		
		
	}

}
