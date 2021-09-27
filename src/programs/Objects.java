package programs;

public class Objects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Objects ref= new Objects();
		System.out.println(ref);

		System.out.println(ref.toString());
		System.out.println(ref.hashCode());
		Objects ref1= new Objects();
		System.out.println(ref1);
		System.out.println(ref1.toString());
		System.out.println(ref1.hashCode());
		System.out.println(ref.equals(ref1));
		System.out.println(ref.equals(ref));
		try {
			ref.finalize();
			ref1.finalize();
		} catch (Throwable e) {
			// TODO: handle exception
			e.printStackTrace();
		}


		
	
	
	
	}

}
