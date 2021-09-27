package programs;


public class sumprime {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[15];
				int k=0,sum=0;
for(int i=1;i<30;i++)
{int	 count=0;/////sum of primenumbers
for(int j=2;j<=i/2;j++)
	{
	if(i%j==0)
	{++count;
	break;}
	}
	if(count==0)
	{
		a[k]=i;
		System.out.println(a[k]);
		++k;	
}}//sum of prime 34,23 is exist or not 
int count=0,count1=0;
for(int i=0;i<a.length;i++)
{
for(int j=0;j<a.length;j++)
{sum=0;
sum=a[i]+a[j];
if(sum==34)
{
	if(a[i]!=0){++count;
break;
}}
else if(sum==23)
{if(a[i]!=0){
	++count1;
break;}}
}
}
if(count!=0)
{System.out.println("yes");
}
else
{System.out.println("no");
}
if(count1!=0)
{System.out.println("yes");
}
else
{System.out.println("no");
}
}}
	