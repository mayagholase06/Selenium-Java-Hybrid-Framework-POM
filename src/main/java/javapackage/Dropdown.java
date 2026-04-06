package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\software1\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     
	     driver.manage().window().maximize(); //Maximize window
	     driver.get("https://www.facebook.com/");//open URL
	     driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']")).click();
	     Thread.sleep(3000);
	     
	     //1st way not recommended but industry mostly used
	     List<WebElement> birthMonth = driver.findElements(By.xpath("//select[@id='month']/option"));
	     System.out.println("Total dropdown values are :"+ birthMonth.size());
	     birthMonth.get(9).click();// september
	     System.out.println(birthMonth.get(1).isEnabled());// true
	     
	     //2nd way recommended
	     WebElement bm = driver.findElement(By.xpath("//select[@id='month']"));
         // will use select class constructor
	     Select month = new Select(bm);
	     // select by visible text method
	     //month.selectByVisibleText("dec");// dec
	     // use selectbyvalue
	    // month.selectByValue("6");//apr
	     // use selectbyindex
	     //month.selectByIndex(10);//oct 
	     
	    //3rd way storing all dropdown value in list
	     List<WebElement> dropdown = month.getOptions();
	     System.out.println("total dropdown value are : " + dropdown.size() );
	     for (int i=0; i < dropdown.size(); i++) {
	    	 String dropdownValues = dropdown.get(i).getText();
	    	 if (dropdownValues.equalsIgnoreCase("Aug"));
	    	 dropdown.get(i).click();
	    	 // or
	    	 // month.selectByVisibleText("dropdownValues");
	    	 
	    	 // 4rth way checking dropdown is supporting multiple selection or not.
	    	// System.out.println(month.isMultiple()); //false
	    	// month.selectByIndex(10);
	    	// month.selectByIndex(5);
	    	// month.deselectByIndex(10); //deselecting select value
	    	 
	    	 // 5th way using sendkey
	    	 bm.sendKeys("feb");
	    	 driver.findElement(By.xpath("//select[@id='month']")).sendKeys("feb");
	    	 Thread.sleep(3000);
 
	     }
	     
	     

	}

}
