package com.cs.Pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStrategy;

public  final class  PIMPage extends BasePage {

	 private static final By addOtn = By.xpath("//div[@id=\"app\"]//div[2]/div[1]/button");
	
	 
	 public PIMPage clickOnAddBtn() {
		 
		 click(addOtn, WaitStrategy.CLICKABLE, "Add Button");
		 
		 return this;
	 }
}
