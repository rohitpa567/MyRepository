package com.cs.PracticePackage;

import org.openqa.selenium.By;

import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class CheckoutPage1 extends BasePage {

	private static final By firstName = By.xpath("//input[@id='first-name']");

	private static final By lastName = By.xpath("//input[@id='last-name']");
	private static final By zipCode = By.xpath("//input[@id='postal-code']");
	private static final By continueBtn = By.xpath("//input[@type='submit']");

	public CheckoutPage1 enterFN(String fn) {

		sendKeys(firstName, fn, WaitStrategy.PRESENCE, " FirstNameEntered");
		return this;
	}

	public CheckoutPage1 enterLN(String LN) {

		sendKeys(lastName, LN, WaitStrategy.PRESENCE, " LastNameEntered");
		return this;
	}

	public CheckoutPage1 enterZipCode(String zc) {

		sendKeys(zipCode, zc, WaitStrategy.PRESENCE, " ZipCodeEntered");
		return this;
	}
	public CheckoutPage2 clickOnContinue() {
		click(continueBtn, WaitStrategy.CLICKABLE, " ClickOnContinueBtn");
		
		return new CheckoutPage2();
	}
}
