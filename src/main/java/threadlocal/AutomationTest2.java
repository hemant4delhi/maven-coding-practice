package threadlocal;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;

public class AutomationTest2 {
	
	@Test
	public void test() throws InterruptedException {
	
		System.out.println(Thread.currentThread().getName());
		WebDriver d = new ChromeDriver();
		ThreadLocalImplementation.setDriver(d);
		ThreadLocalImplementation.getDriver().get("https://www.facebook.com/");
		Thread.sleep(30000);	
		ThreadLocalImplementation.getDriver().quit();
		
		
	}

}
