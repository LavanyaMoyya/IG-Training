package com.singleton;

class SuperClass1 implements Cloneable
{
   @Override
   protected Object clone() throws CloneNotSupportedException
   {
      return super.clone();
   }
}


class Singleton1 extends SuperClass
{
    
   public static Singleton1 instance = new Singleton1();

   private Singleton1()
   {
      
   }

   @Override
   protected Object clone() throws CloneNotSupportedException
   {
      throw new CloneNotSupportedException();
   }
}

public class PreventSingletonClone
{
   public static void main( String[] arguments) throws CloneNotSupportedException
   {
      Singleton1 singleton1 = Singleton1.instance;
      Singleton1 singleton2 = ( Singleton1 ) singleton1.clone();
      System.out.println( "Hash code of singleton1 = " + singleton1.hashCode() );
      System.out.println( "Hash code of singleton1 = " + singleton2.hashCode() );
   }
}
 



 