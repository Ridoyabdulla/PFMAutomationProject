package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyCartPage {
	protected WebDriver driver;

	public MyCartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locate element in PFM
	   @FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
		private WebElement cartbtn;
	   
	   @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[1]/div[3]/div[2]/div[1]")
		private WebElement productviews;
	   
	   @FindBy(xpath = "/html/body/div/div/div/div[2]/div/div[1]/div[4]/div[2]/a/div")
		private WebElement productview1;
	
	    public void CartProcess() throws InterruptedException {
		cartbtn.click();
		System.out.println("IN THE CART");		

		//first product assertion verify	
		
		String Ridoy101 = productviews.getText();
		String abdulla101 = "carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.";
		Assert.assertEquals(Ridoy101, abdulla101, "condition mismatch");
		System.out.println("1st product assrsion");		
        //second product assertion verify	
		
		String Ridoy102 = productview1.getText();
		String abdulla102 = "Sauce Labs Bike Light";
		Assert.assertEquals(Ridoy102, abdulla102, "condition mismatch");
		System.out.println("2nd product assertion");
		Thread.sleep(2000);
	}
}
