package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	
	public static WebDriver driver;
	public Properties prop;
	public Properties or;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	public static Logger log = LogManager.getLogger(MasterPage.class);
	
	//Constructor
	public MasterPage() throws Exception {
		// log4j
		log.info("Loading properties file and launching browser...");
		
		// configuration properties file
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src/main/java\\com\\facebook\\repository\\configuration.properties");
	    prop = new Properties();
	    prop.load(ip);
	    
	    log.info("Initializing WebDriver for " + prop.getProperty("browser"));
	    
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
	 
	  //extent reporter
	  
	  @BeforeSuite
	  public static void setupReport() {
	      ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
	      extent = new ExtentReports();
	      extent.attachReporter(spark);
	  }
	  @AfterSuite
	  public static void tearDownReport() {
	      extent.flush();
	  }
	  //For Failure Screenshots
	  public String getScreenshot(String testCaseName) throws java.io.IOException {
		    org.openqa.selenium.TakesScreenshot ts = (org.openqa.selenium.TakesScreenshot) driver;
		    java.io.File source = ts.getScreenshotAs(org.openqa.selenium.OutputType.FILE);
		    
		    String destinationPath = System.getProperty("user.dir") + "/target/" + testCaseName + ".png";
		    java.io.File finalDestination = new java.io.File(destinationPath);
		    org.apache.commons.io.FileUtils.copyFile(source, finalDestination);
		    
		    return destinationPath;
		}
}

