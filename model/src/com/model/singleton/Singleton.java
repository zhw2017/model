package com.model.singleton;

//饿汉式
public class Singleton {
	private static Singleton slt=new Singleton();
	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		return slt;
	}
}
