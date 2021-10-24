package Interview;

import java.lang.reflect.Constructor;


class A{
	
	private A()
	{}
	
	
	void add()
	{
		
		System.out.println("Hello");
	}
	
}

public class Question1 {

	public static void main(String[] args) throws Exception {
	 
		Constructor<A> c=A.class.getDeclaredConstructor();
		c.setAccessible(true);
		A a=c.newInstance();
		a.add();
	}

}
