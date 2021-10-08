package seleniumTest;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
	ChromeDriver driver;
	void invokedbrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver",
			"C:\\MyData\\Courses\\CourseProjects\\SeleniumFirstProject\\src\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/");
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
