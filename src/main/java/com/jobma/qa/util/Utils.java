package com.jobma.qa.util;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.jobma.qa.base.TestBase;

public class Utils extends TestBase {
	
	public static void wait(WebDriver driver1 , WebElement ele)
	{

  System.out.println("wait statement");
		WebDriverWait w = new WebDriverWait(driver1,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(ele));
		//ele.click();
	}

}
