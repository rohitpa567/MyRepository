package com.cs.Pages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;
import com.cs.enums.WaitStrategy;

public final class AddCustomerDetailsPage extends BasePage {

	private static final By fName = By.name("firstName");
	private static final By mName = By.name("middleName");
	private static final By lName = By.name("lastName");
	private static final By saveBtn = By.xpath("//button[@type='submit']");
	private static final By conMsg = By.xpath("//*[text()='Successfully Saved']");

	public AddCustomerDetailsPage enterFName(String firstName) {

		sendKeys(fName, firstName + System.currentTimeMillis(), WaitStrategy.PRESENCE, "FirstName");
		return this;
	}

	public AddCustomerDetailsPage enterMName(String middleName) {

		sendKeys(mName, middleName + System.currentTimeMillis(), WaitStrategy.PRESENCE, "MiddleName");
		return this;
	}

	public AddCustomerDetailsPage enterLName(String lastName) {

		sendKeys(lName, lastName + System.currentTimeMillis(), WaitStrategy.PRESENCE, "LastName");
		return this;
	}

	public void clickOnSaveBtn() {

		click(saveBtn, WaitStrategy.CLICKABLE, "SAVE BUTTON");
	}

	public String getConfirmationMsg() {
		String conMsgText = DriverManager.getDriver().findElement(conMsg).getText();
          return conMsgText;
	}
}
