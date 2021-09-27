package Interview;

import java.io.Serializable;

public class Human implements Cloneable,Serializable{
	
	public int value;
	public String str;
	
	public Human(int value,String str)
	{
		this.value=value;
		this.str=str;
		
	}
	public void get(int value,String str)
	{
		this.value=value;
		this.str=str;
		
	}
	public Human()
	{
		System.out.println("Hello world" + this.hashCode());
		
	}
	
	public String print()
	{
		return "New object created";
	}
	
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 160694;
//	}
	
	

@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

}
