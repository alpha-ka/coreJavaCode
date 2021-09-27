package basicfromscratch;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,2,3,4};
		int y[]= {5,6,7,8};
		int z[]= {9,0,1,2};
		int w[][]= new int[3][4];
		System.out.println("2D Array");
		System.out.println("Initialize value through For loop");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(i==0) 
				{		w[i][j]=x[j];
		        System.out.print(w[i][j]+" ");
			}
		        else if(i==1) 
		        {	w[i][j]=y[j];
				System.out.print(w[i][j]+" ");
		        }
		        else 
		        {	w[i][j]=z[j];
				System.out.print(w[i][j]+" ");
		        }
			}
			System.out.println("");

		}
		System.out.println("Enhanced for loop");
		for(int i []:w)//how many arrays
		{
			for(int j :i)//array value into j variable
			{
				System.out.print(j+" ");// print j value
			}System.out.println();
		}
		System.out.println("3D Array initialize");
		int c[][][]=new int[4][4][4];
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				for(int k=0;k<4;k++)
				{
					c[i][j][k]=i+j+k;
					System.out.print(c[i][j][k]+" ");
				}
			}
			System.out.println("");

		}
		System.out.println("3D Array Enhanced loop");
		for(int i[][] :c)
		{
			for(int j[] : i)
			{
				for(int k :j)
				{
					System.out.print(k+" ");
				}
				
			}
			System.out.println("");

		}
		
	
}}