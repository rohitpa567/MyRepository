 package com.cs.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cs.Driver.DriverManager;
import com.cs.Factories.ExplicitWaitFactory;
import com.cs.constants.FrameworkConstants;
import com.cs.enums.WaitStrategy;
import com.cs.reports.ExtentLogger;

public class BasePage {

	protected void click(By by,WaitStrategy waitStrategy,String elementName) {
		
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
		ExtentLogger.pass(elementName+"clicked");

		//explicitlyWaitforElement(by,waitStrategy);
	//	DriverManager.getDriver().findElement(by).click();
	}

	
	protected void selectFromDropdown(WebElement dropdownElement, String optionValue,String elementName) {
	    Select dropdown = new Select(dropdownElement);
	    dropdown.selectByVisibleText(optionValue);
	    ExtentLogger.pass(elementName);

	    
	}

	

	
	

	protected void sendKeys(By by, String value,WaitStrategy waitStrategy,String elementName) {
		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
		ExtentLogger.pass(value + " is entered successfully in" + elementName);
		
		//explicitlyWaitforElement(by,waitStrategy);
		//DriverManager.getDriver().findElement(by).sendKeys(value);
	}

	protected String getPageTitle() {
		return DriverManager.getDriver().getTitle();
	}

	private static void explicitlyWaitforElementToBeClickable(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait());
		wait.until(ExpectedConditions.elementToBeClickable(by));
	}

	private static void explicitlyWaitForElementToBePresent(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait());
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}

	private static void explicitlyWaitForElementToBeVisible(By by) {
		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), FrameworkConstants.getExplicitwait());
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
		
	}
	
	private static void explicitlyWaitforElement(By by, WaitStrategy waitStrategy)
	{
			if (waitStrategy==WaitStrategy.PRESENCE)
				explicitlyWaitForElementToBePresent(by);
			else if (waitStrategy==WaitStrategy.CLICKABLE)
				explicitlyWaitforElementToBeClickable(by);
			else if (waitStrategy==WaitStrategy.VISIBLE)
				explicitlyWaitForElementToBeVisible(by);
			else
				explicitlyWaitForElementToBePresent(by);
	}

	
	
	
	
	
	
	

}
