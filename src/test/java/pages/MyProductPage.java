package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyProductPage {
 
	protected WebDriver driver;
	// constructor
	public MyProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locate element in PFM
	   @FindBy(id = "add-to-cart-sauce-labs-backpack")
		private WebElement firstProduct;
	   
	   @FindBy(id = "add-to-cart-sauce-labs-bike-light")
		private WebElement secondProduct;

		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement sortDropdown;
		
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
		private WebElement productNames1;
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement sortDropdown1;
		
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
		private WebElement productNames2;
		
		@FindBy(id = "add-to-cart-sauce-labs-onesie")
		private WebElement singleProduct;
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[1]/div[3]/a")
		private WebElement cartBtn;
		
		@FindBy(id = "checkout")
		private WebElement checkoutbtn;
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement sortDropdown2;
		
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
		private WebElement productNames3;
		
		@FindBy(xpath = "/html/body/div/div/div/div[1]/div[2]/div/span/select")
		private WebElement sortDropdown3;
		
		@FindBy(xpath = "/html/body/div/div/div/div[2]/div/div/div/div[1]/div[2]/div[1]/a/div")
		private WebElement productNames4;
		
		public void BuyFirstTwoProduct() throws InterruptedException {
			// add to cart some products
			firstProduct.click();
			System.out.println("1st product add to cart completed");
			
			secondProduct.click();
			System.out.println("2nd product add to cart completed");			
			Thread.sleep(4000);
		}
		public void addaSingleProduct() throws InterruptedException {
			 singleProduct.click();
			 Thread.sleep(2000);
			 cartBtn.click();			
			 checkoutbtn.click();
			 Thread.sleep(5000);
		}
		
		public void priceLowToHigh() throws InterruptedException {
			
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			//SELECT LOW TO HIGH
			Select select = new Select(sortDropdown);
			select.selectByIndex(2);
			System.out.println("LOW to HIGH COMPLETE");
			Thread.sleep(2000);
			
			//Verify that product is in correct order
			String actProduct = productNames1.getText();
			String expProduct = "Sauce Labs Onesie";
			Assert.assertEquals(actProduct, expProduct, "Condition mismatch");
			System.out.println("verify that Product is in correct order");
		}
		public void priceHighToLow() throws InterruptedException {
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			
			//SELECT HIGH TO LOW

			Select select = new Select(sortDropdown1);
			select.selectByIndex(3);
			System.out.println("HIGH TO LOW COMPLETE");
			Thread.sleep(2000);
			
			//Verify that product is in correct order
			String actProduct1 = productNames2.getText();
			String expProduct1 = "Sauce Labs Fleece Jacket";
			Assert.assertEquals(actProduct1, expProduct1, "Condition mismatch");
			System.out.println("verify that HIGH TO LOW Product is in correct order");
		}
		public void nameAToZ() throws InterruptedException {
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			//SELECT A TO Z
			Select select = new Select(sortDropdown2);
			select.selectByIndex(0);
			System.out.println("A TO Z COMPLETE");
			Thread.sleep(2000);
			
			//Verify that product is in correct order
			String actProduct2 = productNames3.getText();
			String expProduct2 = "Sauce Labs Backpack";
			Assert.assertEquals(actProduct2, expProduct2, "Condition mismatch");
			System.out.println("verify that Product Z TO A is in correct order");
		}
		public void nameZToA() throws InterruptedException {
			//Assertion
			String expectedURL = "https://www.saucedemo.com/inventory.html";
			String actualURL = driver.getCurrentUrl();
			Assert.assertEquals(expectedURL, actualURL);
			System.out.println("Product page assertion successfull");
			Thread.sleep(2000);
			//SELECT Z TO A
			Select select = new Select(sortDropdown3);
			select.selectByIndex(1);
			System.out.println("Z TO A COMPLETE");
			Thread.sleep(2000);
			//Verify that product is in correct order
			String actProduct3 = productNames4.getText();
			String expProduct3 = "Test.allTheThings() T-Shirt (Red)";
			Assert.assertEquals(actProduct3, expProduct3, "Condition mismatch");
			System.out.println("verify that Product Z TO A is in correct order");
		}


}
