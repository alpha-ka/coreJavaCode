package Thread;
class Hi2 implements Runnable
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



class Hello2 implements Runnable
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




public class RunnableExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//			Hi2 hi=new Hi2();
//			Hello2 hello=new Hello2();
//			hi.show();
//			hello.show();
			Thread t1=new Thread(() -> {
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
				}});
			Thread t2=new Thread(() -> {
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
				}});
			System.out.println("Started.....");
			t1.start();
			try{Thread.sleep(10);}catch(Exception e){}
			t2.start();
			
			t1.join();
			t2.join();
			
			System.out.println("Completed.....");
			
	}

}
