package javapackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintPrice {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
       // set chromedriver path
		System.setProperty("webdriver.chrome.driver","C:\\software1\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    // launch browser
	    driver.get("https://www.amazon.in/s?k=iphone");
	    Thread.sleep(5000);
	    
	    // write xpath
	    WebElement price = driver.findElement(By.xpath("//span[@class='a-price-whole']"));

	        // Step 4: Print price
	        System.out.println("iPhone Price: " + price.getText());
	        // I used XPath with class attributes to locate the price element and printed using getText()

	        // Step 5: Close browser
	       // driver.quit();
	    }
	
	    	
	}


