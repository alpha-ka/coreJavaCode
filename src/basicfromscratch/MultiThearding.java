package basicfromscratch;

class Test1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("K A ");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}

class Test2 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
		System.out.println("Alpha");
		try{Thread.sleep(1000);}catch(Exception e) {}
		}
	}
}


public class MultiThearding {

	public static void main(String[] args) throws Exception{
// TODO Auto-generated method stub
		Runnable obj1 = new Test1();
		Runnable obj2 = new Test2();
		
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		t2.start();
		System.out.println(t1.isAlive());
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
		
}

}
