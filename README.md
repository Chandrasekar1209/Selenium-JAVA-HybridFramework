# Amazon-
Automating Amazon website using selenium.



Amazon Website Automation

I have been working on automating the Amazon E-commerce website using selenium tool,  in that iam using Maven plug-in to implement the dependency injection. In that I have developed a Hybrid framework which as used data driven  and Modular driven frame work which makes code maintenance easy and efficient. In this page object model design pattern is used for that creates Object Repository for web UI elements.
Locators:
In this project i used different  locators like id, class-name, xpath, cssSelector. In xpath i used  parent, child,ancestor,text() concept to locate the elements. In css selector the id should be used with “#” like syntax : css=tag#id and for class “.” should be used like syntax:  css=tag.class.
Frame Work:
In src/main/java folder i created a common java packages like Browser Factory,Config Data Provider, Constant, Excel Read, Exception Handler,Logger,Screen shot and Java Utile  packages for code reusability.
In src/test/folder test oriented packages like Base,Data Provider,Report,Listener,Page Objects,Pages  and Test.
*BrowserFactory:
In this there is two methods one it is for start the browser “startBrowser” and other is for closing the  browser “quitBrowser”,in this multiple browser can be launched separately at a  time by getting the browser name from the property file as “chrome” or “firefox” according to the name of the browser this have compatibility logic to launch accordingly.
*ConfigDataProvider:
It is used to get a data from properties file in this i have used single ton class for property manager which has only one object (an instance of the class) at a time  which reduces the creation object and the memory in the stack memory. Every object will point to this instance object. In this getter method is there to load from the properties file so we can  use in other classes.
*Constant:
This is used to have a constant details required for the  projects like location of the  drivers,screenshots,excel file etc..which will be inside the  project directory its self so it is easy to pluginand use in other system also.In this every variables are in static so it can be used any where in the project.

*ExcelRead:
It is used to read the data from the excel file in the  xlsx formate file will we supported,if XSSF is used means 2003-2007 and above xlsx file should be used if we are using below the year means we can use HSSF.In this File input stream and workbook is used to fetch the data by  Map concept,with the help of row and column count fetching the data in separate cells and make it as key and value and storing as a row in the 2D Array format.
Eg:[emailAddress:seky123@gmail.com,Expected:success]
the above example is in map  data is stored inside the 2d array.
*JavaUtil:
In this project independent java methods are written for example Date and Time formate method.
public static String getCurrentDateTime() {
		DateFormat customFormat=new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	} 
where i learn how to do custom utility which used in any where in the project according to the need.
*Logger:
In this project iam using Log4j for logging the test steps. I have used both properties file and xml file loggers according to our convenient we can use,In properties file logger method we can enter in to a new file with out deleting previous logs. The logs will not truncate every time we executing the test case.
*ScreenShots:
I have separate package for taking the screen shots which can  be written in Java utile package also,using this screenshot in testng listeners for on test pass and test fail,the image is captured and stored in a screenshot folder accordingly.
*BasePage:
In this  common method like clickable,find elements,actions,wait,java script executor ,etc.. which will help full to reduce the code size and easy to assess the method for the element to  be done its own action.
*TestBase:
In this the page objects are initialised and the object  creation is done in before class by  using testng frame work,In before suite and after suite the starting and quieting  of browser operation is done accordingly.
*DataProvider:
In this according to test cases  the data in separate excel sheets can be identify by comparing with the method name  and data are retrieved from excel  and with the help of map concept from excel-read returning as a  object then collecting hear and returning the data from data provider to test cases.
*Report:
In this Extent Report version 3.1.5 is used to generate  a report,In the extent manager which consists of the format and appearance of the report  the conversion of  html to extent report  by using the instance method for object creation only ones and creating a report path for where to save the report inside the  project  all of them are done  in the extent manager class.
*Listener:
In this Itest listener  is used the capturing of screen shots and attaching to the report  is automatically take care of listeners. It will take care of generating the report in suite levelfrom starting to end.
*PageObjects:
In this  creating a interface  to use in the pages,by separating the page and objects which will be easy to identify  the error and change the element paths accordingly. Different locators are used to identify the elements.
*Pages & Test Cases:
In this method for   pages are developed and used in the  test cases  by developing a xml using testng and running the test cases in suite level.
