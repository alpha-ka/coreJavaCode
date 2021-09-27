package Thread;
 

class  Volatile implements Runnable
{
	static volatile boolean stopRequested;
	
	 public void run()
	{
		 int i=0;
		while(!stopRequested)
		{
			i++;
		
		}
		
		System.out.println("Background Thread Completed.....");
	}

}



public class VolatileExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Volatile v=new Volatile();
		
	 
		System.out.println("stopRequested value "+v.stopRequested);
		Thread th=new Thread(v);
		th.start();
		Thread.sleep(1000);
		v.stopRequested=true;
		System.out.println("stopRequested value "+v.stopRequested);
		System.out.println("Main thread Completed");
	 
		
		
		
		
	}

}
