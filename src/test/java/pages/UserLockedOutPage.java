package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserLockedOutPage {
	protected WebDriver driver;

	public UserLockedOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locate element in PFM
	@FindBy(id = "user-name")
	private WebElement usernamefield;

	@FindBy(id = "password")
	private WebElement passwordfield;

	@FindBy(id = "login-button")
	private WebElement loginbtnfield;
	
	@FindBy(xpath = "/html/body/div/div/div[2]/div[1]/div/div/form/div[3]/h3")
	private WebElement check;

	public void LockedOut() {

		usernamefield.sendKeys("locked_out_user");
		System.out.println("User set completed");

		passwordfield.sendKeys("secret_sauce");
		System.out.println("User password completed");

		loginbtnfield.click();
		System.out.println("SORRRYYYYY");

		String Ridoy404 = check.getText();
		String abdulla404 = "Epic sadface: Sorry, this user has been locked out.";
		Assert.assertEquals(Ridoy404, abdulla404);
		System.out.println("Wronggggggggg USER");
	}
}
