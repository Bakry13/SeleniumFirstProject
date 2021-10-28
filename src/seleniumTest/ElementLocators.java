package seleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementLocators {
	Actions actions;
	ChromeDriver driver;
	void invokedbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Mohamed\\Desktop\\Course\\SeleniumFirstProject\\src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/");
//			driver.get("https://www.google.com.eg/");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.findElement(By.id("search_query_top")).sendKeys("Blouse");
			driver.findElement(By.id("search_query_top")).clear();
			WebElement searchElement = driver.findElement(By.id("search_query_top"));
			actions.moveToElement(searchElement);
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








//=======================Element locators===================
//driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
//driver.findElement(By.id("email")).sendKeys("test@moakt.cc");
//driver.findElement(By.id("passwd")).sendKeys("Test@123");
//driver.findElement(By.name("SubmitLogin")).click();
//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/header[1]/div[3]/div[1]/div[1]/div[2]/form[1]/input[4]")).sendKeys("Blouse");
//driver.findElement(By.cssSelector("button[name='submit_search']")).click();
//driver.findElement(By.linkText("Gmail")).click();
//driver.findElement(By.partialLinkText("Gma")).click();
//=================Get commands================
//String title = driver.getTitle();
//String url = driver.getCurrentUrl();
//String sourceCode = driver.getPageSource();
//System.out.println(title);
//System.out.println(url);
//System.out.println(sourceCode);
//driver.navigate().to("https://www.google.com.eg/");
//driver.navigate().refresh();
//driver.navigate().back();
//driver.navigate().forward();
//================Close - Quit==============
//driver.close();
//driver.quit();