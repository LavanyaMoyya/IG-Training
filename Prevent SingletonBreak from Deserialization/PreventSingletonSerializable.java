package com.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class SingletonSS implements Serializable {
	/**
	 * 
	 */

	private static final long serialVersionUID = 1L;
	public static SingletonSS instance = new SingletonSS();

	private SingletonSS() {

	}

	protected Object readResolve() {
		return instance;
	}
}
public class PreventSingletonSerializable {
	public static void main(String[] args) {
		try {
			SingletonSS instance1 = SingletonSS.instance;
			ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();

			ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));

			SingletonSS instance2 = (SingletonSS) in.readObject();
			in.close();

			System.out.println("instance1 hashCode:- " + instance1.hashCode());
			System.out.println("instance2 hashCode:- " + instance2.hashCode());
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
