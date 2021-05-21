class thread1
{
   public static void main(String args[])
   {
      Thread t=Thread.currentThread();
      System.out.println("current thread is:  "+t);
      t.setName("my thread");
      System.out.println("current thread is:  "+t);
      
      try
       {
          for(int i=0;i<=5;i++)
          {
             System.out.println("n");
             Thread.sleep(1000);
          }
       } 
       catch(Exception e)
        {
               System.out.println("err");
         }
    }
}

