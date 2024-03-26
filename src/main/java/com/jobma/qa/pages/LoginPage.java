package com.jobma.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.util.Utils;

public class LoginPage extends TestBase {
	@FindBy(xpath="//input[contains(@id,'jobma_user_name')]")
	public WebElement usernamefield;

	@FindBy(xpath="//input[contains(@id,'password')]")
	WebElement passwordfield;

	@FindBy(xpath="//span[contains(text(),'Login to your account')]")
	WebElement loginbtn;
	
	@FindBy(xpath="//span[contains(text(),'Email/password does not match.')]")
	public
	WebElement validationmessage;
	
	@FindBy(xpath="//span[contains(text(),'Credentials not matching with our record')]")
	public
	WebElement validationmessage1;

	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}

	public Dashboard login(String username,String pass) throws InterruptedException
	{  
		usernamefield.sendKeys(username);

		passwordfield.sendKeys(pass);

			Utils.wait(driver, loginbtn);
		loginbtn.click();
		return new Dashboard();

	}

	public void loginInvalidData(String username ,String pass)
	{
		usernamefield.sendKeys(username);

		passwordfield.sendKeys(pass);
		
		Utils.wait(driver, loginbtn);
		loginbtn.click();
		
		
	}












}
