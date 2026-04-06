package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginURL {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize();
	     
	     Thread.sleep(3000);
	     driver.get("https://www.facebook.com/");
	     
	     
	     
	}

	}


