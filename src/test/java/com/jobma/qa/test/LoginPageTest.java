package com.jobma.qa.test;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.bouncycastle.jcajce.provider.symmetric.util.PBE.Util;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.Dashboard;
import com.jobma.qa.pages.LoginPage;
import com.jobma.qa.util.Utils;

import utility.ExcelUtils;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class LoginPageTest extends TestBase {

	String projectPath = System.getProperty("user.dir");

	@DataProvider(name="login_Data")
	public Object[][] logindata()
	{
		ExcelUtils eu = new ExcelUtils(projectPath+"/excel/logindata.xlsx","sheet1");
		Object[][] data1 = 	eu.readExceltData();
		return data1;

	}



	@BeforeTest()
	public void setup() throws InterruptedException
	{
		TestBase.initialize();
		lp = new LoginPage();


	}






	@Test(dataProvider = "login_Data",priority =1)
	public void invalidDataLogin(String u ,String p) throws InterruptedException
	{
		lp.loginInvalidData(u,p);
		Thread.sleep(3000);
		



		driver.navigate().refresh();
	}














	@AfterTest()
	public void close()
	{
		TestBase.exit();
	}



}
