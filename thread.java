
class A extends Thread
{
	
	public void run()
	{
		int i=0;
		while(i<=10)
		{
		  System.out.println("hello");
         if(i==7)
         {
           try
           {
            sleep(1000);
           }
   
         catch(Exception e){}
		 
		}
        i++; 
	   }
   }
}
class B extends Thread
{
	
	public void run()
	{
		int i=0;
		while(i<=10)
		{
		 System.out.println("hi");
        if(i==5)
        {
         try
         {
          sleep(1000);
          }
          catch(Exception e){}
        } 
		
		 i++;
		} 	
				
	}
}

class thread
{
	public static void main(String args[])
	{
		A a=new A();
		B b=new B();
        
		b.start();
		a.start();
        
	}
}		
				   
