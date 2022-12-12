package Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class facebook {
	
	WebDriver driver;
	String ApplicationUrlAddress="https://www.facebook.com/login/";
	
	@BeforeTest
	public void Setup() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Desktop\\Testing\\Variable\\newdriverfile\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(ApplicationUrlAddress);
	driver.manage().window().maximize();
	
	}
	
   @Test 
   public void voidacebook_LogIn() throws InterruptedException {
	  // <input type="text" class="inputtext _55r1 inputtext _1kbt inputtext _1kbt" name="email" id="email" tabindex="0" placeholder="Email address or phone number" value="" autofocus="1" autocomplete="username" aria-label="Email address or phone number"> 
	   WebElement UserName=driver.findElement(By.id("email"));
	   Thread.sleep(3000);
	   UserName.sendKeys("9948608525");
	   Thread.sleep(3000);
	   //<input type="password" class="inputtext _55r1 inputtext _9npi inputtext _9npi" name="pass" id="pass" tabindex="0" placeholder="Password" value="" autocomplete="current-password" aria-label="Password">
	   WebElement Password=driver.findElement(By.id("pass"));
	   Thread.sleep(3000);
	   Password.sendKeys("santhoshsunny");
	   Thread.sleep(3000);
	   
	   //<button value="1" class="_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy" id="loginbutton" name="login" tabindex="0" type="submit">Log in</button>
	   WebElement LogIn=driver.findElement(By.id("loginbutton"));
	   LogIn.click();
   }
}
