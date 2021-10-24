package Interview;

public class hashcodeandequal {
	
	public static void main(String agrs[])
	{
		
		Human human = new Human(1, "Alpha");
		Human human1 = new Human(1, "Alpha");
		
		System.out.println(human);//hashcode but not interger
		System.out.println(human.hashCode()); // this hashcode method using object address and doing some calculation and returning some number 
		
		
		System.out.println(human1);
		System.out.println(human1.hashCode());
		
		//Now i'm going to override hashcode and getting same int code for all object
		
		
		//As per below and abocve scenario hashcode will generate unique but ?
		String s1="Alpha";
		String s2="Alpha";
		System.out.println(s1.hashCode()+" "+s2.hashCode());
		//If objects are same then hashcode also will be same
		System.out.println(s1+" & "+s2+"="+s1.equals(s2));
		
		// here String is different and also we except that hashcode should be unique? See the output
		String s3="FB";
		String s4="Ea";
		System.out.println(s3.hashCode()+" "+s4.hashCode());
		//Yesh it's same so hashcode() will not generate unique always and it's not trustable
		// Hashcode is same but we are not sure that object is same it's generate
		System.out.println(s3+" & "+s4+"="+s3.equals(s4));
	}

	
}


 

