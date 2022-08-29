package com.methodReference;
interface Messagble{
	MethodReferenceConstructor getMessage(String msg);
}
public class MethodReferenceConstructor {
	public MethodReferenceConstructor(String msg) {
		System.out.println(msg);
	}
	  public static void main(String[] args) {  
		  Messagble hello = MethodReferenceConstructor::new;  
	        hello.getMessage("Hello");  
	    }  
}
