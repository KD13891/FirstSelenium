package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static WebDriver driver;
	public static void launchBrowser() {	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\singhk2x\\Documents\\SeleniumProject\\chromedriver_win32 (1)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
}
