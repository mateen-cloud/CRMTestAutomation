package com.cmr.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.cmr.qa.base.TestBase;
import com.cmr.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{

	LoginPage loginPage;
	public LoginPageTest() {
		
		super();
	}
	@BeforeMethod
	public void  setUp() {
		initialization();
		loginPage= new LoginPage();
	}
	
	@Test(priority=1)	
	public void LoginPageTitleTest() {
		
		String title=loginPage.validatingPageTitle();
		Assert.assertEquals(title, "Free CRM #1 cloud software for any business large or small");
		
	}
@Test(priority=2)	
public void LoginPageLogoTest() {
		boolean flag=loginPage.validatinglog();
		Assert.assertTrue(flag);
	}
@Test(priority=3)		
public void LoginTest() {
	
	loginPage.Hitloginbtn();
	loginPage.Login(prop.getProperty("userName"),prop.getProperty("password"));
	
	
}

	@AfterMethod
	public void teardown() {
		
		driver.close();
	}
	
	
}
