package OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OHRM_LogInTest {

  public static void main(String[] args) {
	
     String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.01/symfony";
     
     WebDriver driver;
     
    System.setProperty("webdriver.chrome.driver",  "/driverFiles/chromedriver";
    String expected_ohrmPageTitle="orangeHRM";
    String expected_OhrmlHomepageTitle;
	System.out.println("The Expected title of orangeHRM application" + "Homepage is : "+expected_OhrmlHomepageTitle);
    
 //validating the Title of OrangeHRM Application HomePage
//validation of Ohrm Application UrL Address
	//<input name="txtUsername" id="txtUsername" type="text"> -UserName
	  driver.findElement(By.id("txtUsername")).sendKeys("srini");
	  
	//   Identifying the Element         operation on the Elements
	  
	  
	  

	  
}
	
	
	
	
	
	  
}
