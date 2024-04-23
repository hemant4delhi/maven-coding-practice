package threadlocal;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class AutomationTest {
	
	@Test
	public void test() throws InterruptedException {
	
		System.out.println(Thread.currentThread().getName());
		WebDriver driver = new ChromeDriver();
		ThreadLocalImplementation.setDriver(driver);
		ThreadLocalImplementation.getDriver().get("https://www.google.com/");
		Thread.sleep(30000);		
		ThreadLocalImplementation.getDriver().quit();
		
	}

}
