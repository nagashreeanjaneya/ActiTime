package actiTimeLib;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

public class BasePage {
public WebDriver driver;
public WebDriverWait wait;
public BasePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	wait=new WebDriverWait(driver, 20);
}
public void checkTitle(String title) {
	try {
		wait.until(ExpectedConditions.titleIs(title));
		Reporter.log("Title is Matching", true);
	} catch (TimeoutException e) {
		Reporter.log("Title is not matching", true);
	}
}
public void chechWebElement(WebElement element) {
	try {
		wait.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("WebElement is present", true);
	} catch (TimeoutException e) {
		Reporter.log("WebElement is not present", true);
	}
}
}
