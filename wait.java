class A extends Thread
{
   public  void run()
   {
         for(int j=1;j<=5;j++)
		{
				
			System.out.println("the value is j:"+j);
		}
   }
}
class wa()
{
  public static void main(String args[])
  {
     A ob=new A();
     ob.run();
     for(int i=1;i<=5;i++)
	 {
        System.out.println("it's main thread");
	 }
  }
}  