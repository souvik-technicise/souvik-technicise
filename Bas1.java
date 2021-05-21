class A
{
	int a;
	int b;
	public A()
	{
		a=10;
		b=20;
	}
	
}
class B extends A
{
	public B()
	{
		super();
	}
	void set()
	{
		System.out.println(a+" "+b);
	}
}
				
class Bas1
{
	public static void main(String args[])
	{
		
		B ob=new B();
		ob.set();
	}
}
