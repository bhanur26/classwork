package com.pack;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Main4 {

	static final Logger logger=Logger.getLogger(Main3.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DOMConfigurator.configure("Log4j1"
				+ ".xml");
		logger.debug("Sample debug message");
		logger.error("error message");
		logger.fatal("fatal message");
		logger.info("info message");
		logger.warn("warn message");
}

}
