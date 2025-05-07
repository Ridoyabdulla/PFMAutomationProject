package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOutPage {
	
	protected WebDriver driver;

	public LogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locate element in PFM
	   @FindBy(id = "react-burger-menu-btn")
		private WebElement menubtn;
	   
	   @FindBy(id = "logout_sidebar_link")
		private WebElement logoutbtn;
	   	   
       public void UserLogoutTest() throws InterruptedException {		
	     menubtn.click();
	     logoutbtn.click();		
		System.out.println("USER LOGOUT");
		Thread.sleep(2000);
		//Assertion
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(expectedURL, actualURL);
		System.out.println(" Verify that the user is redirected to the login page.");
		Thread.sleep(2000);

	}
 
}
