package com.cs.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.cs.Driver.Driver;

public class BaseTests {

	protected BaseTests() {}
/*
	@BeforeSuite
	public void beforeSuite() {

		ExtentReport.initReport();
	}
// already in Listener Class
	@AfterSuite
	public void afterSuite() {
		ExtentReport.flushreports();
	}
         */
	@BeforeMethod
	protected void tearUp() throws Exception {

		Driver.initDriver();

	}

	@AfterMethod
	protected void tearDown() {

		Driver.quitDriver();

	}

}
