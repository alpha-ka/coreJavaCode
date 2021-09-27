package   basicfromscratch;


import java.lang.reflect.Method;


class Abc
{
	}
interface Abc2
{
	}



public class callprivatemethod {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//class Class
		Class c = Class.forName("basicfromscratch.Test");
		Test t = (Test) c.newInstance();
		
		// acccess one private method
		Method m =c.getDeclaredMethod("display", null);
		m.setAccessible(true);// it will set to access the method
		m.invoke(t, null);// this will invoke that method and give the output
		
		// access multiple private methods in a class
		Method[] m2 =c.getDeclaredMethods();
		for (Method m1 :m2)
		{
		m1.setAccessible(true);
		m1.invoke(t, null);
		}
		
	Class c1 = Class.forName("basicfromscratch.Abc");
	System.out.println(c1.isInterface());
	System.out.println(c1.getSuperclass());
	
	
	Class c2 = Class.forName("basicfromscratch.Abc2");
	System.out.println(c2.isInterface());
	System.out.println(c2.getSuperclass());
		
		
	}

}
