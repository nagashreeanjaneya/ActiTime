package actiTimeTest;

import org.testng.annotations.Test;

import actiTimeLib.BaseTest;
import actiTimePO.ActiTimeHomePagePO;
import actiTimePO.ActiTimeLoginPagePO;

public class TestHome extends BaseTest {
	@Test
	public void testLogout() {
		driver.get(TEST_URl);
		ActiTimeLoginPagePO loginPagePO =new ActiTimeLoginPagePO(driver);
		loginPagePO.login("nagashreeanjaneya17", "EseXyMEb");
		ActiTimeHomePagePO homePagePO =new ActiTimeHomePagePO(driver);
		homePagePO.chechWebElement(homePagePO.logoutBtn());
		homePagePO.logout();
	}
}
