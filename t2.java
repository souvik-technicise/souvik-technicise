class A implements Runnable
{
  public void run()
  {
     for(int i=0;i<=5;i++)
      {
         System.out.println("hello");
          if(i==3)
          {
            try
            {
              sleep(100);
             }
             catch(Exception e){}
          }
     }
  
  }
}
class B implements Runnable
{

  public void run()
  {
     for(int i=0;i<=5;i++)
      {
         System.out.println("hello");
          if(i==2)
          {
            try
            {
              stop();
             }
             catch(Exception e){}
          }
     }
  }
}
class t2
{
  public static void main(String args[])
  {
    A a=new A();
    Thread a1=new Thread(a);
    B b=new B();
    Thread b1=new Thread(b);
    a1.start();
    b1.start();
  }
}


