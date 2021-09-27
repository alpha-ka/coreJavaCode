package Interview;

//class Test1 implements Runnable

//{
//	public void run()
//	{
//		for(int i=0;i<=5;i++)
//		{
//		System.out.println("K A ");
//		try{Thread.sleep(1000);}catch(Exception e) {}
//		}
//	}
//}
//
//class Test2 implements Runnable
//{
//	public void run()
//	{
//		for(int i=0;i<=5;i++)
//		{
//		System.out.println("Alpha");
//		try{Thread.sleep(1000);}catch(Exception e) {}
//		}
//	}
//}

public class MultiThearding {

	public static void main(String[] args) throws Exception {
// TODO Auto-generated method stub
//		Runnable obj1 = new Test1();
//		Runnable obj2 = new Test2();

		Runnable obj1 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("K A " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		};
		Runnable obj2 = () -> {
			for (int i = 0; i <= 5; i++) {
				System.out.println("Alpha " + Thread.currentThread().getPriority());
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
				}
			}
		};

//		Thread t1 = new Thread(obj1);
//		Thread t2 = new Thread(obj2);
//		
//		t1.setName("Alpha - 0");
//		t2.setName("Alpha - 1");

		Thread t1 = new Thread(obj1, "Alpha - 0");
		Thread t2 = new Thread(obj2, "Alpha - 1");

		System.out.println("Before calling start method with thread");
		System.out.println(t1.getName() + " is alive? " + t1.isAlive());// checking active or not
		System.out.println(t2.getName() + " is alive? " + t2.isAlive() + "\n");
		System.out.println("Get priority for the threads by default it will be normal priority so it value is 5");
		System.out.println(t1.getName() + " priority - " + t1.getPriority());
		System.out.println(t2.getName() + " priority - " + t2.getPriority() + "\n");
		System.out.println(
				"We can also set the priority based on following list: \n 1.Thread.MIN_PRIORITY - 1 \n 2.Thread.NORM_PRIORITY - 5\n 3.Thread.MAX_PRIORITY - 10\n");

		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getName() + " Min priority - " + t1.getPriority());
		System.out.println(t2.getName() + " MAX priority - " + t2.getPriority());
		System.out.println();
		System.out.println("After calling start method with thread");
		t1.start();
		System.out.println(t1.getName() + " is alive? " + t1.isAlive());

		try {
			Thread.sleep(10);
		} catch (Exception e) {
		}

		t2.start();
		System.out.println(t2.getName() + " is alive? " + t2.isAlive());

		t1.join();// join method is for wait and we are saying wait main thread until thread o
					// complete his process
		t2.join();
		System.out.println();
		System.out.println("After completed thread");
		System.out.println(t1.getName() + " is alive? " + t1.isAlive());
		System.out.println(t2.getName() + " is alive? " + t2.isAlive());
		System.out.println("Bye");

	}

}
