package testPackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import POM.PomFbCreateAccount_withPagefactory;
import base.Base;

public class FbcreateAccount_pagefactory extends Base {
	
	  
	  @BeforeTest
	  public void beforeTest() { 
		  Base.launchBrowser();
		  }
	 

	@Test
	public void fillCreateAccount_withPagaFactory() throws IOException, InterruptedException {
		
		FileReader file=new FileReader("C:\\\\Users\\\\singhk2x\\\\Documents\\\\SeleniumProject\\data.txt");
		BufferedReader br2=new BufferedReader(file);
		String line2;
		while( (line2=br2.readLine()) != null) {
			PomFbCreateAccount_withPagefactory dataenter=new PomFbCreateAccount_withPagefactory();
			String[] input2=line2.split(",",8);
			dataenter.typeFname(input2[0]);
			dataenter.typeLname(input2[1]);
			dataenter.typeNum(input2[2]);
			dataenter.typePassword(input2[3]);
			dataenter.typeDay(input2[4]);
			dataenter.typeMonth(input2[5]);
			dataenter.typeYear(input2[6]);
			dataenter.selectSex(input2[7]);
			Thread.sleep(2000);
			driver.get("https://www.facebook.com/");
		}
	}
}
