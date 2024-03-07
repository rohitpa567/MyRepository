package com.cs.PracticePackage;

import org.openqa.selenium.By;

import com.cs.Driver.DriverManager;
import com.cs.Pages.BasePage;

public class FinishPage extends BasePage {

	public static final By conMsg = By.xpath("//h2[text()='THANK YOU FOR YOUR ORDER']");

	public String getConMsg() {

		String msgString = DriverManager.getDriver().findElement(conMsg).getText();
       
		return msgString;
	}

}
