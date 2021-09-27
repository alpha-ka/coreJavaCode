package singleton;

public class SingletonLazy {

 
		public static void main(String [] args)
		{
			
			XYZ obj=XYZ.getInstance();
			XYZ obj2=XYZ.getInstance();
			
		}

	}

	class XYZ{
		
		static XYZ obj;
		private XYZ() {
			System.out.println("Instance of Object Created");
		}
		
		static XYZ getInstance()
		{
			if(obj==null)
			obj=new XYZ();
			
			return obj;
		}
		
	}
