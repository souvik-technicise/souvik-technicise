package com.company;

abstract class vichele
{
    int taier;
    abstract void start();
}
abstract class car extends vichele{

  int milege;
  abstract void fun();
   /* void start()
    {
        taier=5;
        System.out.println("no of taier is "+taier);
    }*/
}
class bike extends car{

    void fun()
    {
        System.out.println("today is astami" );
    }

    void start()
    {
        taier=5;
        System.out.println("no of taier is "+taier);
    }


    void show()
    {
        start();
        milege =10;
        System.out.println("hello "+milege);
    }
}
public class Main {

    public static void main(String[] args) {
        //using grand father reference
        vichele v1=new bike();
        System.out.println("it's grandfather rederence");
        v1.start();

       //using parent reference
       car c1=new bike();
       System.out.println("it's father rederence");
       c1.fun();
       c1.start();
      //using object
      bike b1=new bike();
        System.out.println("it's child rederence");
        b1.show();

    }
}
