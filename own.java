class A extends RuntimeException
{

    public A()
    {
         super();
         //System.out.println("a is running");
    }
}
class B extends RuntimeException
{
    public B()
    {
         super();
        //System.out.println("b is running");
    }
}

class own
{
   public static void main(String args[])
   {
      int p,q;
      p=20;
      q=10;
      if(p>q)
         throw new A();
      else
          throw new B();
   }
}
    
