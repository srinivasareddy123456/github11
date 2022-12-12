package com_BaseTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	public static WebDriver diver;
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	
	@BeforeMethod 
	public void setUp() 
	{
    System.setProperties("Webdriver.chromedriver.driver,")
     
    "./browserDriverFiles/chromedriver.exe");
    
    diver=new ChromeDriver();
   
    Log.info
	
	
	
	
	
	
	
	}
	
	
	
	
	

}
