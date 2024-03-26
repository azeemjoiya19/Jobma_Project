package com.jobma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class Dashboard extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'Dashboard')]")
	public
	WebElement dashboardtitle;
	
	public Dashboard()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String dashboardTitle()
	{
		String title=  dashboardtitle.getText();
		return title;
	}
	
	
	
	
	
	}


