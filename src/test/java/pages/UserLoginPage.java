package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class UserLoginPage {
  
	protected WebDriver driver;

	// constructor
	public UserLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	// Locate element in PFM
		@FindBy(id = "user-name")
		private WebElement usernameField;
		@FindBy(id = "password")
		private WebElement passwordField;
		@FindBy(id = "login-button")
		private WebElement loginBtn;
		
        //Negative
		@FindBy(id = "user-name")
		private WebElement usernameField1;
		
		@FindBy(id = "password")
		private WebElement passwordField1;
		
		@FindBy(id = "login-button")
		private WebElement loginBtn1;
		
		@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")
		private WebElement negativelogin;
		
	    // actions
		public void enterUser(String username) {
			usernameField.sendKeys(username);
			System.out.println("User set completed");
		}
		public void enterPassword(String password) {
			passwordField.sendKeys(password);
			System.out.println("Password set completed");
		}
		public void clickLogin() {
			loginBtn.click();
			System.out.println("Click completed");
		}
		public void incorrectUser() {
			usernameField1.sendKeys("standard_user");
		    //password
			passwordField1.sendKeys("secret_saucee");
			//login
			loginBtn1.click();
		    System.out.println("Incorrect user");
		    
		    String Ridoy404 = negativelogin.getText();
			String abdulla404 = "Epic sadface: Username and password do not match any user in this service";
			Assert.assertEquals(Ridoy404, abdulla404);
			System.out.println("negative Assertion");
	}

}
