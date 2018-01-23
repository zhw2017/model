package com.model.singleton;

//双重检索  核心机制：使用volatile关键字修饰的变量，在内存中读写共享。
public class Singleton3 {
	private volatile static Singleton3 slt=null;
	private Singleton3() {
		
	}
	
	public static Singleton3 getInstance() {
		if(slt==null) {
			synchronized (Singleton3.class) {
				if(slt==null) {
					slt=new Singleton3();
				}
			}
		}
		
		return slt;
	}
}
