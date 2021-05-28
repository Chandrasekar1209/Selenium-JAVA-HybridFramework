package com.htc.configDataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.htc.constant.Constant;

public class PropertyManager  {

	private static PropertyManager  instance;
	private static final Object lock = new Object();
	Properties prop = new Properties();

//********** SINGLETON CLASS PROPERTY MANAGER ************//
	public static PropertyManager  getInstance () {
		if (instance == null) {
			synchronized (lock) {
				instance = new PropertyManager ();
				instance.ConfigDataProvider();
			}
		}
		return instance;
	}

	public void ConfigDataProvider() {

		File source=new File(Constant.properties_file_location);
		try {
			FileInputStream fileInputStream=new FileInputStream(source);
			prop.load(fileInputStream);
			
		} catch (Exception e) {
			System.out.println("Not able to load config file "+e.getMessage());
		}
		 
	}


	public String getBrowser() {
		return prop.getProperty("browser");
	}

	public String getStagingURL() {
		return prop.getProperty("url");
	}

	public String getDriverLocatioin() {
		return prop.getProperty("driverLocation");
	}




}
