import java.util.Scanner;
class A
{
	int k=1;
	public void triangle(int num)
	{
		for(int i=1;i<=num;i++)
		{
          for(int j=1;j<=i;j++)
		  {
                 System.out.print( k );
				 k++;
		  }
		  System.out.println();
        }
    }
}
class floyd
{
  public static void main(String args[])
  {
    A a=new A();
	Scanner sc=new Scanner(System.in);
	int h=sc.nextInt();
    a.triangle(h);
  }
}  