package com.cs.PracticePackage;

import org.openqa.selenium.By;

import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class YourCartPage extends BasePage {
	
	private static final By checkOutBtn= By.xpath("//*[text()='CHECKOUT']");


	   public CheckoutPage1 clickOnCheckOutBtn() {
		   click(checkOutBtn, WaitStrategy.CLICKABLE, " Click On CheckOutBtn");
		   return new CheckoutPage1();
		   
	   }

}
