package com.htc.screenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.htc.javaUtil.JavaUtil;

public class Screenshot {


	public static String captureScreenShot(WebDriver driver, String fileName, String filePath ) {
		String screenshotPath=System.getProperty("user.dir")+filePath + fileName +"_"+ JavaUtil.getCurrentDateTime() +".png";
		// System.getProperty("user.dir")+
		try {
			System.out.println("capture screeshot method");
			TakesScreenshot screenShot = (TakesScreenshot) driver;
			File source = screenShot.getScreenshotAs(OutputType.FILE);
			File destination=new File(screenshotPath);
			FileUtils.copyFile(source,destination );
		} catch (Exception e) {
			System.out.println("Exception while taking Screenshot"+e.getMessage());
		}
		return screenshotPath;

	}
	 public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		  String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		  TakesScreenshot ts = (TakesScreenshot) driver;
		  File source = ts.getScreenshotAs(OutputType.FILE);
		  
		  // after execution, you could see a folder "FailedTestsScreenshots" under src folder
		  String destination = System.getProperty("user.dir") + "\\Screenshots\\" + screenshotName + dateName + ".png";
		  File finalDestination = new File(destination);
		  FileUtils.copyFile(source, finalDestination);
		  return destination;
		 }
	
	
	
	
}
