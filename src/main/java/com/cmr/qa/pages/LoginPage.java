package com.cmr.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cmr.qa.base.TestBase;

public class LoginPage extends TestBase {

	
	HomePage homePage;
	// initilizing page factory
	
	public LoginPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	// page factory elements
	
	@FindBy(xpath="//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']") 
	WebElement login;
	
	@FindBy(xpath="//a[@class='btn btn-sm btn-white btn-icon btn-icon-left btn-shadow btn-border btn-rect offset-sm-top-60 offset-top-30']")
	WebElement SignUp;
	
	@FindBy(name="email") WebElement uName;
	
	@FindBy(name="password") WebElement pwd;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']") WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(text(),'free')]") WebElement logo;
	
	
	// Actions
	
	public String validatingPageTitle() {
		
		return driver.getTitle();
	}
	
public boolean validatinglog() {
	
		return logo.isDisplayed();
	}
	
public void Hitloginbtn() {
	
	login.click();
}
public HomePage Login(String un,String pd) {
	
	uName.sendKeys(un);
	pwd.sendKeys(pd);
	loginbtn.click();
	return new HomePage();
	
}

public void verify() {
	
	System.out.println("veryfy");
	
}

public void verifyMask() {
	
	System.out.println("veryfy");
	
}

}
