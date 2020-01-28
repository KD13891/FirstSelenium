package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.Base;

//without pagefactory

public class FbCreateAccountPage extends Base {

	
	By Firstname=By.name("firstname");
	By Surname=By.name("lastname");
	By NumberOrEmail = By.name("reg_email__");
	By Password=By.name("reg_passwd__");
	By Birthday=By.name("birthday_day");
	By Birthmonth=By.name("birthday_month");
	By Birthyear=By.name("birthday_year");
	By sex=By.xpath("//span[@data-name='gender_wrapper']/span[1]/label");
	
	//public FbCreateAccountPage(WebDriver driver) {
		
	//}
	
	//Create user actions
 
	public void typeFirstname(String fname) {
		driver.findElement(Firstname).sendKeys(fname);
	}
	public void typelname(String lname) {
		driver.findElement(Surname).sendKeys(lname);;
	}
	public void typeMobOrEmail(String mob) {
		driver.findElement(NumberOrEmail).sendKeys(mob);;
	}
	
	public void typePassword(String pass) {
		driver.findElement(Password).sendKeys(pass);;
	}
	
  public void selectBirthday(String day) {
	  Select dropdownDay=new Select(driver.findElement(Birthday));
	  dropdownDay.selectByValue(day);
	  
  }
  public void selectBirthMonth(String month) {
	  Select dropdownMonth=new Select(driver.findElement(Birthmonth));
	  dropdownMonth.selectByIndex(Integer.parseInt(month));
	  
  }
  public void selectBirthYear(String year) {
	  Select dropdownYear=new Select(driver.findElement(Birthyear));
	  dropdownYear.selectByValue(year);
  }
  
 

public void selectGender(String gender) {
	// TODO Auto-generated method stub
	driver.findElement(sex).click();
}
	

}
