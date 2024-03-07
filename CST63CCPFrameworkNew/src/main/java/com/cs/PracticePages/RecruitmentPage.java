package com.cs.PracticePages;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;
import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class RecruitmentPage extends BasePage {

	private static final By fName = By.name("firstName");
	private static final By lName = By.name("lastName");
	private static final By eMail = By.xpath("//input[@placeholder='Type here']");
	private static final By clickOnSaveBtn = By.xpath("//button[@type='submit']");
    private static final By addOtn = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
    private static final By conMsg = By.xpath("//*[text()='Successfully Saved']");

	 
	 public RecruitmentPage clickOnAddBtn() {
		 
		 click(addOtn, WaitStrategy.CLICKABLE, "Add Button");
		 
		 return this;
	 }
	
	public RecruitmentPage enterFname(String firstName) {

		sendKeys(fName, firstName, WaitStrategy.PRESENCE, "FIRSTNAME");
		return this;
	}

	public RecruitmentPage enterLname(String lastName) {

		sendKeys(lName, lastName, WaitStrategy.PRESENCE, "Lastname");
		return this;
	}

	public RecruitmentPage enterEmail(String Email) {

		sendKeys(eMail, Email, WaitStrategy.PRESENCE, "EMAIL ENTERED");
		return this;
	}

	public void clickOnSaveBtn() {
              click(clickOnSaveBtn, WaitStrategy.CLICKABLE, "SAVE BTN CLICKED" );
	}
	
	public String getConfirmationMsg() {
		String conMsgText = DriverManager.getDriver().findElement(conMsg).getText();
          return conMsgText;
}
}