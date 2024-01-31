package com.arun.main;

//Eager Initialization

public class Logger {
	
	private static Logger logger=new Logger();
	
	private Logger()
	{
		
	}
	
	public static Logger getInstance()
	{
		return logger;
	}
	

}
