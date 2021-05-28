package com.htc.logger;

import org.apache.log4j.xml.DOMConfigurator;

import com.htc.constant.Constant;

public class XMLlog4jConfigurator {

	public static void loadInLoggerFile() {
		DOMConfigurator.configure(Constant.xmlLoggerLocation);
		}
	
}
