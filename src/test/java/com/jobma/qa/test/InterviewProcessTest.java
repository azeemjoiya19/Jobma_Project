package com.jobma.qa.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.jobma.qa.base.TestBase;
import com.jobma.qa.pages.InterviewProcess;
import com.jobma.qa.util.Utils;

import utility.ExcelUtils;

public class InterviewProcessTest extends TestBase {


	String projectPath = System.getProperty("user.dir");

	@DataProvider(name="interview_link")
	public Object[][] getInterviewLink()
	{
		ExcelUtils eu = new ExcelUtils(projectPath+"/excel/InterviewLink.xlsx","Sheet1");
		Object [][] data = eu.readExceltData();
		return data ; 
	}


	@BeforeClass
	public void setup() throws InterruptedException
	{
		TestBase.initializeInterviewProcess();

	}

	@Test(dataProvider = "interview_link")
	public void interviewProcessTest(String link) throws InterruptedException, AWTException


	{

		System.out.println(link);
		driver.get(link);
		InterviewProcess p = new InterviewProcess();
		Utils.wait(driver,p.okbutton );
		// Thread.sleep(10000);
		//	 InterviewProcess p = new InterviewProcess();

		p.clickOnOk();
		p.clickOnContinueButton();
		p.clickOnprivacycheckbox();
		p.clickOnprivacycheckboxAI();
		p.clickOnContinueButton();
		Thread.sleep(3000);
		
		Alert alert = driver.switchTo().alert();
		 alert.accept();
		 driver.switchTo().defaultContent();
	/*	Robot robot = new Robot();
		  for (int i = 0; i < 3; i++) {
              robot.keyPress(KeyEvent.VK_TAB);
              robot.keyRelease(KeyEvent.VK_TAB);
          }
		  robot.keyPress(KeyEvent.VK_ENTER);
          robot.keyRelease(KeyEvent.VK_ENTER); */
          Thread.sleep(10000);
          p.clickOnSkip();
          p.clickOnContinueButton();
          



	}

	/*@AfterClass
	public void close()
	{
		driver.quit();
	}
	*/

}
