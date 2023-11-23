package seleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FirstScript {
	WebDriver driver;
	void invokedBrowser()
	{
		try {
//			System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\Mohamed\\Desktop\\Course\\SeleniumFirstProject\\src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			//============================================================================
			driver.get("https://automationexercise.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
			driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("test@teml.net");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
			driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
			driver.quit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		FirstScript Obj = new FirstScript();
		Obj.invokedBrowser();
	}
}