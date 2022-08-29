package com.singleton;

class SuperClass implements Cloneable 
{ 
  @Override
  protected Object clone() throws CloneNotSupportedException  
  { 
    return super.clone(); 
  } 
} 
  
class Singleton extends SuperClass 
{ 

  public static Singleton instance = new Singleton(); 
  
  private Singleton()  
  { 
    
  } 
}
public class SingletonClone
{
   public static void main( String[] arguments) throws CloneNotSupportedException
   {
      Singleton singleton1 = Singleton.instance; 
      Singleton singleton2 = (Singleton) singleton1.clone(); 
      System.out.println("Hash code of singleton1 = "
                             + singleton1.hashCode()); 
      System.out.println("Hash code of singleton1 = " 
                             + singleton2.hashCode()); 
   }
}
 