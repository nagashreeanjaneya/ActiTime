package actiTimeTest;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeLoginPagePO;

public class TestLogin extends BaseTest {
	@Test(priority=1)
	public void testValidCredentials() {
		try {
			driver.get(TEST_URl);
			ActiTimeLoginPagePO loginPagePO =new ActiTimeLoginPagePO(driver);
			loginPagePO.login("nagashreeanjaneya17", "EseXyMEb");
			//System.out.println(driver.getTitle());
			String eTitle ="actiTIME - Enter Time-Track";
			loginPagePO.checkTitle(eTitle);
			String aTilte=driver.getTitle();
			Assert.assertEquals(aTilte, eTitle);
		} catch (Exception e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=2)
	public void testInvalidUn() {
		try {
			driver.get(TEST_URl);
			ActiTimeLoginPagePO loginPagePO =new ActiTimeLoginPagePO(driver);
			loginPagePO.login("nagashreeanjaneya15236", "EseXyMEb");
			loginPagePO.chechWebElement(loginPagePO.errorMsg());
			boolean aStatus = loginPagePO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (Exception e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
	}
	@Test(priority=3)
	public void testInvalidPw() {
		try {
			driver.get(TEST_URl);
			ActiTimeLoginPagePO loginPagePO =new ActiTimeLoginPagePO(driver);
			loginPagePO.login("nagashreeanjaneya17", "assdf");
			loginPagePO.chechWebElement(loginPagePO.errorMsg());
			boolean aStatus = loginPagePO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (Exception e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
	}
	@Test(priority=4)
	public void testInvalidUnAndPw() {
		try {
			driver.get(TEST_URl);
			ActiTimeLoginPagePO loginPagePO =new ActiTimeLoginPagePO(driver);
			loginPagePO.login("nagashreeanjaneya1526", "assdf");
			loginPagePO.chechWebElement(loginPagePO.errorMsg());
			boolean aStatus = loginPagePO.errorMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (Exception e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}	
	}
}
