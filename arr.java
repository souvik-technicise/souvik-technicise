
import java.util.Scanner;
class A
{
	public void set()
	{
		int a[]=new int[5];
		for(int i=0;i<5;i++)
		{
		  Scanner sc=new Scanner(System.in);
		  int ab=sc.nextInt();
		  a[i]=ab;
		}
	    for(int i=0;i<5;i++)
		{
		   System.out.println(a[i]);
		 }
		 
	}
	public void get()
	{
		int a[];
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		a=new int[n];
		for(int i=0;i<5;i++)
		{
		  System.out.println("print number");
		  int ab=sc.nextInt();
		  a[i]=ab;
		}
	    for(int i=0;i<5;i++)
		{
			System.out.println("show number");
		   System.out.println(a[i]);
		 }	   
    }
}    
class arr
{
	public static void main(String args[])
	{
		A ob=new A();
		ob.get();
	}
}				  
