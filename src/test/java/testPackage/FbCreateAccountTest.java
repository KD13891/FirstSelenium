package testPackage;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.FbCreateAccountPage;
import POM.PomFbCreateAccount_withPagefactory;
import base.Base;


public class FbCreateAccountTest extends Base {

	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	

	@Test
	public void fillFBCreateAccount() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\singhk2x\\Documents\\SeleniumProject\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		FbCreateAccountPage enter=new FbCreateAccountPage();
		
		FileReader fl=new FileReader("C:\\\\Users\\\\singhk2x\\\\Documents\\\\SeleniumProject\\data.txt");
		BufferedReader br=new BufferedReader(fl);
		String line;
		while( (line=br.readLine()) != null) {
			String[] input=line.split(",",8);

			enter.typeFirstname(input[0]);
			enter.typelname(input[1]);
			enter.typeMobOrEmail(input[2]);
			enter.typePassword(input[3]);
			enter.selectBirthday(input[4]);
			enter.selectBirthMonth(input[5]);
			enter.selectBirthYear(input[6]);
			enter.selectGender(input[7]);
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
		}
	}
			

}

