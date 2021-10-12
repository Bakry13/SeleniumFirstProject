package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementLocators {
	
	ChromeDriver driver;
	Actions actions;
	void invokedbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver",
			"C:\\MyData\\Courses\\CourseProjects\\SeleniumFirstProject\\src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//			driver.findElement(By.id("email")).sendKeys("test@moakt.cc");
//			driver.findElement(By.id("passwd")).sendKeys("Test@123");
//			driver.findElement(By.name("SubmitLogin")).click();
//			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("Blouse");
//			driver.findElement(By.cssSelector("button[name='submit_search']")).click();
			Thread.sleep(1000);
			actions.moveToElement(driver.findElement(By.linkText("Popular"))).build().perform();
			driver.findElement(By.linkText("Popular")).click();
//			driver.quit();
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) 
	{
		ElementLocators Obj = new ElementLocators();
		Obj.invokedbrowser();
	}

}
