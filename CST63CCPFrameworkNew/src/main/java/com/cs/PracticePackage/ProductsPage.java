package com.cs.PracticePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cs.Driver.DriverManager;
import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class ProductsPage extends BasePage {

	private static final By clickOnDropDown = By.xpath("//*[@id=\"inventory_filter_container\"]/select");
	private static final By selectProduct = By.xpath("//div[@class='pricebar']/button");
	private static final By clickOnAddToCart = By.xpath("(//*[@id=\"shopping_cart_container\"]/a//*)[1]");
	private static final By getTittle = By.xpath("//div[text()='Products']");

	public ProductsPage clickOnDropDown() {
		WebElement webElement = DriverManager.getDriver().findElement(clickOnDropDown);
		selectFromDropdown(webElement, "Price (high to low)", "Product Filtered");
          return this;
	}
	
	public ProductsPage selectProduct() {
		click(selectProduct, WaitStrategy.CLICKABLE, "Product Added");
		return this;
		
	}
	
	public ProductsPage clickOnAddToCart() {
		click(clickOnAddToCart, WaitStrategy.CLICKABLE, "ClickOnAddToCart");
		return this;
	}
	
	
	public String getPageTittle() {
		String text = DriverManager.getDriver().findElement(getTittle).getText();
		return text;
	}
	
	
	
}
