package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartBadgeCountPage {

	protected WebDriver driver;

	public CartBadgeCountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Locate element in PFM
	@FindBy(id = "add-to-cart-sauce-labs-backpack")
	private WebElement productadd1;

	@FindBy(id = "add-to-cart-sauce-labs-bike-light")
	private WebElement productadd2;

	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement productremove;

	public void UserCount() throws InterruptedException {

		productadd1.click();
		System.out.println("1st product add to cart completed");

		productadd2.click();
		System.out.println("2nd product add to cart completed");
		Thread.sleep(2000);

		productremove.click();
		System.out.println("This item removed");
		Thread.sleep(2000);

	}
}
