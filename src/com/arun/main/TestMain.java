package com.arun.main;

public class TestMain {
	
	public static void main(String args[])
	{
		Logger log1=Logger.getInstance();
		Logger log2=Logger.getInstance();
		System.out.println(log1);
		System.out.println(log2);
		
		
		LazyLogger logger1=LazyLogger.getInstance();
		LazyLogger logger2=LazyLogger.getInstance();
		System.out.println(logger1);
		System.out.println(logger2);
		
		Samosa s1=Samosa.INSTANCE;
		Samosa s2=Samosa.INSTANCE;
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
	}

}
