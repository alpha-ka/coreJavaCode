package programs;

public class sumpalin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int add=0;
		for(int i=1;i<10;i++)
		{int sum=0,m=0,n=i;
			while(n!=0)
			{
				m=n%10;
				sum=(sum*10)+m;
				n=n/10;
				}
			if(i==sum)
			{add=add+sum;
			}
	}
		System.out.println(add);
		add=0;
		for(int i=123;i<150;i++)
		{int sum=0,m=0,n=i;
			while(n!=0)
			{
				m=n%10;
				sum=(sum*10)+m;
				n=n/10;
				}
			if(i==sum)
			{add=add+sum;
			}
	}
		System.out.println(add);
	}}