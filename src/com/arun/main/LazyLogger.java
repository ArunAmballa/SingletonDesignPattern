package com.arun.main;

//Lazy initialization

public class LazyLogger {
	
	private static LazyLogger logger=null;
	
	private LazyLogger()
	{
		
	}
	
	public static LazyLogger getInstance()
	{
		if(logger==null)
		{
			logger=new LazyLogger();
		}
		return logger;
	}
	
	//Thread Safe
	
	
//	public static LazyLogger getInstance()
//	{
//		if(logger==null)
//		synchronized(LazyLogger.class)
//		{
//			if(logger==null)
//			{
//				logger=new LazyLogger();
//			}
//		}
//		
//		return logger;
//	}

}
