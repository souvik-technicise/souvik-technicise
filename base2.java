interface A
{
	int a=10;
	void get();
}
class B implements A
{
	int c=20;
	void get()
	{
		System.out.println(a+" "+c);
	}
}
class base2
{
	public static void main(String args[])
	{
		B ob=new B();
		ob.get();
	}
}					
