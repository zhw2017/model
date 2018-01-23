package com.model.singleton;

//懒汉式
public class Singleton2 {
	private static Singleton2 slt=null;
	private Singleton2() {
		
	}
	
	public synchronized static Singleton2 getInstance() {
		if(slt==null) {
			slt=new Singleton2();
		}
		return slt;
	}
}
