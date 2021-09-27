package programs;

public class excephand {
	int ivalue = 10;

	void print() {
		System.out.println("instance method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method st
		System.out.println(".........main Starts...........");
		int firstnum = 10, secondnum = 0, result = 0;
		excephand ref = null;
		try {
			result = firstnum / secondnum; // it calls the try/catch methid
											// through JVM
			System.out.println(ref.ivalue);
			ref.print();
		} catch (ArithmeticException e)// object created
		{
			e.printStackTrace();
			System.out.println(e.getMessage());
			
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		finally{
			
			System.out.println("Finally gets executed  when exception handled or not handled");
		}
		System.out.println(result);
		System.out.println(".......main ends..........");
	}

}
