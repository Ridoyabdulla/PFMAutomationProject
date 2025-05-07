package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckoutOverviewPage {
	protected WebDriver driver;

	public CheckoutOverviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
}
	// Locate element in PFM
	   @FindBy(id = "first-name")
		private WebElement firstnamefield;
	   
	   @FindBy(id = "last-name")
		private WebElement lastnamefield;
	   
	   @FindBy(id = "postal-code")
		private WebElement postalnamefield;
	   
	   @FindBy(id = "continue")
		private WebElement continuebtn;
	   
	   @FindBy(id = "finish")
		private WebElement finishbtn;
	   
	   @FindBy(xpath = "/html/body/div/div/div/div[2]/h2")
		private WebElement complete;
	   
	   public void CheckoutProcess() throws InterruptedException {
		    firstnamefield.sendKeys("john");
		    lastnamefield.sendKeys("Doe");
		    postalnamefield.sendKeys("12345");
			Thread.sleep(2000);
			continuebtn.click();
			finishbtn.click();
			 System.out.println("checkout complete");
			 
			 String Ridoy40 = complete.getText();
			String abdulla40 = "Thank you for your order!";
			Assert.assertEquals(Ridoy40, abdulla40);
			System.out.println("Complete Assertion");
			 

			
		}
}
