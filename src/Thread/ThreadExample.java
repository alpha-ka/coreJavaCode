package Thread;
class Hi extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hi");
			try
			{Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
		
}



class Hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello");
			try
			{Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
		
	}

}




public class ThreadExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			Hi hi=new Hi();
			Hello hello=new Hello();
//			hi.show();
//			hello.show();
			System.out.println("Started.....");
			hi.start();
			try{Thread.sleep(10);}catch(Exception e){}
			hello.start();
			
			hi.join();
			hello.join();
			
			System.out.println("Completed.....");
			
	}

}
