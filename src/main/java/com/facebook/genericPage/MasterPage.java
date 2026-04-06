package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	//Constructor
	public MasterPage() throws Exception {
		
		// configuration properties file
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src/main/java\\com\\facebook\\repository\\configuration.properties");
	    prop = new Properties();
	    prop.load(ip);
	    
		// Locators properties file
		FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+ "\\src/main/java\\com\\facebook\\repository\\locators.properties");
	    or = new Properties();
	    or.load(fs);
	    
	    if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    }
	    else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
	    	System.setProperty("webdriver.gecko.driver","C:\\Users\\mayag\\eclipse-workspace\\TestartifactID\\com.facebook.drivers\\geckodriver.exe");
	        driver = new FirefoxDriver();
	    }
	    else {
	    	System.out.println("Open IE browser");
	    }
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    }
	  public void click(String xpathkey) {
		  driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	  }
	  public void sendData(String xpathkey, String data) {
		  driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(data);
	  }
}

