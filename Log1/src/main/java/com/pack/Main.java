package com.pack;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Main {
	
	static final Logger logger=Logger.getLogger(Main.class);
	
	public static void main(String args[]) {
		
		BasicConfigurator.configure();
		logger.debug("Sample debug message");
		logger.error("error message");
		logger.fatal("fatal message");
		logger.info("info message");
		logger.warn("warn message");
		
	}

}
