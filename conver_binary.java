import java.util.Scanner;
class A
{
	
	int b[]=new int[10];
	int i=0;
	public void convert(int a)
	{
		while(a!=0)
		{
          int r=a%2;
          b[i]=r;
          a=a/2;
          i++;
        }
		for(int j=i-1;j>=0;j--)
		{
          System.out.print(b[j]);	
        }		  
    }
}	
class conver_binary
{
	public static void main(String args[])
	{
		A x=new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("give binary number");
		int a=sc.nextInt();
		x.convert(a);
	}
}	