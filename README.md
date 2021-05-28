Amazon Website Automation

I have been working on automating the Amazon E-commerce website using the selenium tool, tI is using Maven plug-in to implement the dependency injection. In the,t I have developed a Hybrid framework which as used data-driven and Modular driven framework which makes code maintenance easy and efficient. On this page object model design pattern is used that creates an Object Repository for web UI elements.XPathtors:

This project used different locators like id, class-name, xpath, CSS selector. In XPath i used  parent, child,ancestor,text() concept to locate the elements. In CSS selector the id should be used with “#” like syntax: css=tag#id and for class “.” should be used like syntax:  css=tag.class.

FrameWork:
In the src/main/java folder I created common java packages like Browser Factory, Config Data Provider, Constant, Excel Read, Exception Handler, Logger, Screenshot and Java Utile packages for code reusability.
In src/test/folder test-oriented packages like Base,Data Provider,Report,Listener,Page Objects,Pages  and Test.

BrowserFactory:
In this there are two methods one it is for start the browser “start browser” and other is for closing the browser “quitBrowser”, this multiple browsers can be launched separately at a  time by getting the browser name from the property file as “chrome” or “firefox” according to the name of the browser this have compatibility logic to launch accordingly.

ConfigDataProvider:
It is used to get data from properties file in this I have used a singleton class for a property manager which has only one object (an instance of the class) at a time which reduces the created object and the memory in the stack memory. Every object will point to this instance object. This getter method is there to load from the properties file so we can use it in other classes.
Constant:
This is used to have constant details required for the projects like the location of the drivers, screenshots, excel file etc..which will be inside the project directory it’s self so it is easy to plug in and use in another system also. In this every variable is in the start itself can be used anywhere in the project.





ExcelRead:
It is used to read the data from the excel file in the xlsx format file will we supported, if XSSF has used means 2003-2007 and above xlsx file should be used if we are using below the year means we can use HSSF.In this File input stream and workbook is used to fetch the data by  Map concept, with the help of row and column count fetching the data in separate cells and make it as key and value and storing as a row in the 2D Array format.
Eg:[emailAddress:abc123@gmail.com,Expected:success]
the above example is in map data is stored inside the 2d array.

JavaUtil:
In this project, independent java methods are written for example Date and Time formate method.
public static String getCurrentDateTime() {
		DateFormatcustomFormat=newSimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
		Date currentDate=new Date();
		return customFormat.format(currentDate);
	} 
where I learn how to do custom utility which used anywhere in the project according to the need.

Logger:
In this project, I am using Log4j for logging the test steps. I have used both properties file and XML file loggers according to our convenience we can use, In the properties file logger method we can enter into a new file without deleting previous logs. The logs will not truncate every time we execute the test case.


ScreenShots:
I have a separate package for taking the screenshots which can be written in Java utile package also, using this screenshot in TestNG listeners for on test pass and test fail, the image is captured and stored in a screenshot folder accordingly.

BasePage:
This Common method like clickable, find elements, actions, wait, javascript executor, etc.. which will help full to reduce the code size and easy to assess the method for the element to be done its action.




TestBase:
In this, the page objects are initialised and the object creation is done before class by using the TestNG framework, In before suite and after suite the starting and quieting of browser operation is done accordingly.



DataProvider:
In this according to test cases, the data in separate excel sheets can be identified by comparing with the method name and data are retrieved from excel and with the help of map concept from excel-read returning as an object then collecting hear and returning the data from data provider to test cases.

Report:
In this Extent Report version 3.1.5 is used to generate a report, In the extent manager which consists of the format and appearance of the report the conversion of HTML to extent report by using the instance method for object creation only ones and creating a report path for where to save the report inside the project all of them are done in the extent manager class.

Listener:
This Latest listener has used capturing screenshots and attaching them to the report is automatically take care of listeners. It will take care of generating the report in-suite level from starting to end.

PageObjects:
This creating an interface to use in the pages, by separating the page and objects which will be easy to identify the error and change the element paths accordingly. Different locators are used to identifying the elements.

Pages & Test Cases:
In this method for pages are developed and used in the test cases by developing an XML using TestNG and running the test cases at the suite level.


