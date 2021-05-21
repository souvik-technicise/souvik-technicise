class A  extends Exception
{
   int a;
   public A(int n)
   {
     a=n;
   } 
   public String toString()
   {
      System.out.println("the value is greater");
       return"own"+a;
    }
}
class Test
{
    public void fun(int p)
    {
         //int p1=p;
        if(p>10)
        {
             try
             {
              throw new A(p);
              
             }
             catch(A e)
             {
                System.out.println(e);
              }
        }
        else
           System.out.println("greater value");
     }
}
class ownexc_Exception
{
    public static void main(String args[])
    {
       Test ob=new Test();
       ob.fun(25);
       
     }
}
