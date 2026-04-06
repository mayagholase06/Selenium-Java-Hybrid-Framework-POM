package com.facebook.pages;

import org.openqa.selenium.By;

import com.facebook.genericPage.MasterPage;

public class LoginPage extends MasterPage{

	public LoginPage() throws Exception {
		super();
	}
	// click Email or Phone
	//public void clickEmailOrPhone() {
		//click("EmailOrPhone");
	//}
		
		// Enter username
		public void enterUsername() {
			sendData("EmailOrPhone","abc@gmail.com");
		}
		// click Password
		public void clickPassword() {
			click("Password");
		}
			
			// Enter Password
			public void enterPassword() {
				sendData("Password","12345");
			}
			// click Login Button
			//public void clickLoginButton() {
				//click("LoginButton");
				//driver.findElement(By.xpath("//button[@name='login']")).click();
			public void clickLoginButton() {
			    try {
			       
			        org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(driver, 10);
			        org.openqa.selenium.WebElement loginBtn = wait.until(org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable(org.openqa.selenium.By.xpath("//button[@name='login']")));
			        
			      
			        loginBtn.click();
			        System.out.println("Login button clicked successfully!");

			    } catch (Exception e) {
			        System.out.println("Normal click failed, attempting alternative click...");
			        try {
			            
			            org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
			            js.executeScript("arguments[0].click();", driver.findElement(org.openqa.selenium.By.name("login")));
			            System.out.println("Clicked using JavaScript executor.");
			        } catch (Exception ex) {
			            System.out.println("Failed to click the button: " + ex.getMessage());
			        }
			    }
			}}
			    	
			       
			
			     
			
	


