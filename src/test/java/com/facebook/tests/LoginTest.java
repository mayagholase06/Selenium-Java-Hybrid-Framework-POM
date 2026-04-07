package com.facebook.tests;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.facebook.genericPage.MasterPage;
import com.facebook.pages.LoginPage;

public class LoginTest extends MasterPage{

	
	public LoginTest() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test
	public void doLoginTest() throws Exception {
		 MasterPage.test = MasterPage.extent.createTest("Facebook Login Verification");
		LoginPage lp = new LoginPage();
		
	//	lp.clickEmailOrPhone();
		lp.enterUsername();
		MasterPage.test.pass("Username 'abc@gmail.com' entered successfully.");
		lp.clickPassword();
		lp.enterPassword();
		MasterPage.test.pass("Password entered successfully.");
		lp.clickLoginButton();
		MasterPage.test.pass("Login button clicked, and navigating to home page.");
	}
	@AfterClass
	
	public static void closeLoginpage() {
		  if (MasterPage.driver != null) {
		        
		        MasterPage.driver.quit();
		        System.out.println("Browser closed successfully.");
		    } else {
		        
		        System.out.println("Driver was null, nothing to close.");
		    }
	}
		  // for Failure Screenshot
		  @AfterMethod
		    public static void closeloginpage() {
		        if (MasterPage.driver != null) {
		            MasterPage.driver.quit();
		            System.out.println("Browser closed successfully.");
		        } else {
		            System.out.println("Driver was null, nothing to close.");
		        }
		    } // या ब्रॅकेटने ही मेथड इथे संपली पाहिजे

		    @AfterMethod
		    public void tearDown(ITestResult result) throws IOException {
		        if (result.getStatus() == ITestResult.FAILURE) {
		            // जर टेस्ट फेल झाली, तर स्क्रीनशॉट घ्या
		            String screenshotPath = getScreenshot(result.getName());
		            test.fail("Test Case Failed: " + result.getThrowable());
		            test.addScreenCaptureFromPath(screenshotPath);
		        }
		    }
		} 
	