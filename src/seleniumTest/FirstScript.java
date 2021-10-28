package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	WebDriver driver;
	void invokedbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mohamed\\Desktop\\Course\\SeleniumFirstProject\\src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			//============================================================================
			driver.get("http://automationpractice.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
			driver.findElement(By.id("email")).sendKeys("test@moakt.cc");
			driver.findElement(By.id("passwd")).sendKeys("Test@123");
			driver.findElement(By.name("SubmitLogin")).click();
			driver.quit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		FirstScript Obj = new FirstScript();
		Obj.invokedbrowser();
	}
}