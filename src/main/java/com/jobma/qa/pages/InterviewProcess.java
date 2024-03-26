package com.jobma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;

public class InterviewProcess extends TestBase {
	
	@FindBy(xpath= "//button[contains(@id,'okay-button')]")
	public WebElement okbutton;
	
	@FindBy(xpath= "//span[contains(text(),'Get Started')]")
	WebElement getstartedbutton;
	
	
	@FindBy(xpath  = "(//input[contains(@id,'flexCheckDefault')])[1]")
	WebElement privacycheckbox;
	
	@FindBy(xpath  = "(//input[contains(@id,'flexCheckDefault')])[2]")
	WebElement privacycheckboxAI;
	
	@FindBy(xpath  = "//button[contains(@id,'continue-button')]")
	WebElement continuebutton;
	
	
	
	@FindBy(xpath  = "//span[contains(text(),'skip')]")
	WebElement skipbutton;
	
	@FindBy(xpath="//button[contains(@id,'skip-button')]")
	WebElement skip;
	
	
	
	
	//button[contains(@id,'start_interview_now')]
	
	
	
	
	
	
	
	
	
	
	
	
	
	public InterviewProcess()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public void clickOnOk()
	{
		okbutton.click();
	}
	
	
	public void clickOnGetStarted()
	{
		getstartedbutton.click();
	}
	

	public void clickOnprivacycheckbox()
	{
		privacycheckbox.click();
	}
	
	public void clickOnprivacycheckboxAI()
	{
		privacycheckboxAI.click();
	}
	
	public void clickOnContinueButton()
	{
		continuebutton.click();
	}
	
	public void clickOnSkip()
	{
		skip.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
