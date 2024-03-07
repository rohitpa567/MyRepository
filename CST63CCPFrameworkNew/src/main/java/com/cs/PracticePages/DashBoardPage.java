package com.cs.PracticePages;

import org.openqa.selenium.By;

import com.cs.Pages.BasePage;
import com.cs.enums.WaitStrategy;

public class DashBoardPage  extends BasePage{
          
	
	private static final By recOpt=By.xpath("//*[@id=\"app\"]/div[1]/div[1]//li[5]/a/span");


	public RecruitmentPage clickOnRecOpn() {
		click(recOpt, WaitStrategy.CLICKABLE, "Click on Recruitment");
		return new RecruitmentPage();
	}
	
}
