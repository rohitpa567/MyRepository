package com.cs.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.Driver.DriverManager;

public final class LoginTests extends BaseTests {

	private LoginTests() {}
		
	
	@Test
	public void test1() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Cyber Success", Keys.ENTER);

	}

	@Test
	public void test2() {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Best java classes in Pune", Keys.ENTER);

	}
}
