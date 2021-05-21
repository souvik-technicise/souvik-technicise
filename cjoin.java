class A 
{
	static int count;
	public void count()
	{
		for(int i=1;i<=5;i++)
		{
            count++;			
			System.out.println("value of i is:"+count);
		}
    }
}
class B extends A implements Runnable
{
 	public void run()
	{
		System.out.println("it's class B");
		count();
	}
}
class C extends A implements Runnable
{
   public void run()
   {
	 System.out.println("it's class c");  
     count();
   }
}   
class cjoin
{
	public static void main(String args[])throws Exception
	{
		Thread t1=new Thread(new B());
		Thread t2=new Thread(new C());
		t1.start();
		t1.join();
		t2.start();
		t2.join();
	}
}	