package threadlocal;

import org.openqa.selenium.WebDriver;

public class ThreadLocalImplementation {
	
	static ThreadLocal<WebDriver> local = new ThreadLocal<>();
	
	public static void setDriver(WebDriver driver) {
		local.set(driver);;
	}
	
	public static WebDriver getDriver() {
		return local.get();
	}
	
	public static void unload() {
		local.remove();
	}
	

}
