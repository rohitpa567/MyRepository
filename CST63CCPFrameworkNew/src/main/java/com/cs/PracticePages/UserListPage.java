package com.cs.PracticePages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;
import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class UserListPage extends BasePage {

	private static final By createNewUser = By.id("ext-gen40");
	private static final By ConMsg = By.xpath("//span[text()='User account has been successfully created.']");

	public CreateNewUserPage clickOnCreateNewUser() {

		click(createNewUser, WaitStrategy.CLICKABLE, " ClickOnCNU");

		return new CreateNewUserPage();
	}

	public String getConMsg() {
		String text = DriverManager.getDriver().findElement(ConMsg).getText();
		return text;
	}

}
