package programs;
//////////stringbuffer and stringbuilder are mutable once we change its change permanent
public class stringsbuffer {

	public static void main(String[] args) {
		StringBuffer strbuf =new StringBuffer("java");
		StringBuilder strbuild =new StringBuilder("java");
		System.out.println(strbuf);
		System.out.println(strbuild);
		System.out.println(strbuf.append(" is a Programming Language"));
		System.out.println(strbuf);
		System.out.println(strbuf.delete(1, 9));
		System.out.println(strbuf);
		System.out.println(strbuf.insert(1, "ava is a")); 
		System.out.println(strbuf.reverse());
		System.out.println(strbuf.reverse());
		System.out.println(strbuf.replace(10, 10, "Independent "));

	}
}
