
import java.util.Scanner;
class A
{
	void setdata()
	{ 
	
	 Scanner sc=new Scanner(System.in);
	 System.out.println("press 1st number");
	 float a=sc.nextFloat();
	 System.out.println("press 2nd number");
	 float b=sc.nextFloat();
	 int num=(int)(a+b)/2;
	 System.out.println(num);
	
	} 
	void conversion()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("press 1st number");
		double a=sc.nextDouble();
		System.out.println(a);
	}
	void bit()
	{
		//Scanner sc=new Scanner(System.in);
		//String s=sc.nextLine();
		//System.out.print(s);
  String s1="souvik";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.replace('i','%'));
		Scanner Sc=new Scanner(System.in);
		String s2=Sc.nextLine();
		/*System.out.println(s2.substring(5));
		System.out.println(s2.substring(2,5));*/
		char s3[]=s2.toCharArray();
		/*for(int i=0;i<s3.length;i++)
		{
			System.out.println(s3[i]);
		}*/
		int c=0;
		for(int i=0;i<s3.length;i++)
		{
			if(s3[i]=='a'|| s3[i]=='e'|| s3[i]=='o' || s3[i]=='u'|| s3[i]=='i')
			  c=c+1;
			 
		}
		 System.out.print(c);
			
			
	}	
	
}
class New
{
	public static void main(String args[])
	{
		A a1=new A();
		//a1.conversion();
		a1.bit();
	}	
}	
		
