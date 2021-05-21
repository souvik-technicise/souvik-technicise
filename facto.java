import java.util.Scanner;
class A
{
   double s=1;
   public void fact(int n)
   {
     for(int i=1;i<=n;i++)
	     s=s*i;
	  System.out.println("the value is:"+s);
	}
}
class facto
{
   public static void main(String args[])
   {
     A a=new A();
	 Scanner sc=new Scanner(System.in);
	 int p=sc.nextInt();
     a.fact(p);
   }
}   