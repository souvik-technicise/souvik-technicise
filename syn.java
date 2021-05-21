
class share
{
   int count=100;
   public void to()
   {
     for(int i=1;i<=5;i++)
     {
        count=count-1;
        
       System.out.println(count);
     }
   }
}


class A extends share implements Runnable
{
  public void run()
  {
     System.out.print("it's 1st thread");
      try{
           sleep(1000);
          }
          catch(Exception e)
          {
             System.out.print("err");
          }
       to();
  }
}
class B extends share implements Runnable
{
  public void run()
  {
   System.out.print("it's 2nd thread");
   try{
           sleep(2000);
          }
          catch(Exception e)
          {
             System.out.print("err");
          }
    to();
  }
}
 
class syn
{
  public static void main(String args[])
  {
      Thread t1=new Thread(new A());
      Thread t2=new Thread(new B());
      t1.start();
      t2.start();
  }
}
