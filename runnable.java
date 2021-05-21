class A implements Runnable
{
     public void run()
     {
      
        for(int i=0;i<=10;i++)
        {
           System.out.println("the value is :"+i);
           try
            {
              sleep(1000);
            }
            catch(Exception e)
            {
               System.out.print("err");
            }
        }
     }
}
class B implements Runnable
{
     public void run()
     {
      
        for(int i=0;i<=10;i++)
        {
           System.out.println("the value is :"+i);
           try
            {
              sleep(1000);
            }
            catch(Exception e)
            {
               System.out.print("err");
            }
        }
     }
}

class runnable
{
   public static void main(String args[])
   {
     Thread t1=new Thread(new A());
     Thread t2=new Thread(new B());
     t1.start();
     t2.start();
   }
}
  
