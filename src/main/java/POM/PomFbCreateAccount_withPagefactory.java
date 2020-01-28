package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Base;

public class PomFbCreateAccount_withPagefactory extends Base {

	
	@FindBy(name="firstname")
	WebElement fname;
	@FindBy(name="lastname")
	WebElement lname;
	@FindBy(name="reg_email__")
	WebElement num;
	@FindBy(name="reg_passwd__")
	WebElement Pass;
	@FindBy(name="birthday_day")
	WebElement day;
	@FindBy(name="birthday_month")
	WebElement month;
	@FindBy(name="birthday_year")
	WebElement year;
	@FindBy(xpath = "//span[@data-name='gender_wrapper']/span[2]/label")
	WebElement sex;
	
	
	public PomFbCreateAccount_withPagefactory() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void typeFname(String name) {
		fname.sendKeys(name);
	}
	public void typeLname(String surname) {
		lname.sendKeys(surname);
	}
	public void typeNum(String number) {
		num.sendKeys(number);
	}
	public void typePassword(String password) {
		Pass.sendKeys(password);
	}
	public void typeDay(String bday) {
		Select dropdownbday=new Select(day);
		dropdownbday.selectByValue(bday);
		
	}
	
	public void typeMonth(String bmonth) {
		Select dropdownbmonth=new Select(month);
		dropdownbmonth.selectByIndex(Integer.parseInt(bmonth));
	}
	public void typeYear(String byear) {
		Select dropdownbyear=new Select(year);
		dropdownbyear.selectByValue(byear);
	}
public void selectSex(String gender) {
		// TODO Auto-generated method stub
		sex.click();
	}
	
	
}
