 package com.cs.Driver;

import java.time.Duration;
import java.util.Objects;

import org.openqa.selenium.chrome.ChromeDriver;

import com.cs.enums.ConfigProperties;
import com.cs.utils.PropertyUtils;

public class Driver {

	
	public static void initDriver() throws Exception {

		if (Objects.isNull(DriverManager.getDriver())) {

			DriverManager.setDriver(new ChromeDriver());
			DriverManager.getDriver().get(PropertyUtils.get(ConfigProperties.URL));
			//DriverManager.getDriver().get("https://www.google.co.in/");
			DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			DriverManager.getDriver().manage().window().maximize();
			
			
		}

	} 

	public static void quitDriver() {

		if (Objects.nonNull(DriverManager.getDriver())) {
			DriverManager.getDriver().quit();
			DriverManager.unload();

		}
	}
}