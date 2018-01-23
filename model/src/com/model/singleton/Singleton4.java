package com.model.singleton;

//静态内部类
public class Singleton4 {
	private Singleton4() {}
	private static class Singleton4Impl{
		private static Singleton4 slt4=new Singleton4();
	}
	
	public static Singleton4 getInstance() {
		return Singleton4Impl.slt4;
	}
}
