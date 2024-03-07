package com.cs.PracticePackage;

import org.openqa.selenium.By;

import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class CheckoutPage2  extends BasePage{
	
	public static final By finishBtn= By.xpath("(//div[@class='cart_footer']/a)[2]");
	
	
	public FinishPage clickOnFinishBtn() {
		
		click(finishBtn, WaitStrategy.CLICKABLE, " Finish Button clicked");
		return new FinishPage();
	}
	

}