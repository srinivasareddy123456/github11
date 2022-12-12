package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRMApplicationMethods {
	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
@Given("^user should launch the Chrome Browser$")
public void user_should_launch_the_Chrome_Browser() throws Throwable {
	

	System.setProperty("webdriver.chrome.driver", "./browserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();
		
	
    }

@When("^user enters OrangeHRM Application URL Address$")
public void user_enters_OrangeHRM_Application_URL_Address() throws Throwable {
	driver.get(applicationUrlAddress);

    }

@Then("^user should be at the LogIn Page$")
public void user_should_be_at_the_LogIn_Page() throws Throwable {
	WebElement userName=driver.findElement(By.xpath("//*[@id='txtUsername']"));
	userName.clear();
	userName.sendKeys("srinivasareddy");

	WebElement password=driver.findElement(By.name("txtPassword"));
	password.clear();
	password.sendKeys("9908434307usrR@");

	WebElement logInButton=driver.findElement(By.className("button"));
	logInButton.click();
    }

@Then("^user should Close the Application$")
public void user_should_close_the_Application() throws Throwable {
	driver.quit();
    }

	

}
