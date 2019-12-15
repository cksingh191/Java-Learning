package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTest {
	public WebDriver driver;
	@BeforeSuite
	public void setUp() {
		System.out.println("BeforeSuit");
		
	}
	@BeforeTest
	public void lounchBrowser() {
		System.out.println("BeforeTest");
		
	}
	
    @Test
	public void SeleniumBasic() {
		// TODO Auto-generated method stub
		System.out.println("Welcome Selenium");
		System.setProperty("webdriver.chrome.driver", "/Users/chandrashekharsingh/Downloads/chromedriver");	
		 driver = new ChromeDriver(); //launch chrome
		driver.get("http://www.google.com");	//enter url
		
		String title = driver.getTitle(); //get title
		
		System.out.println(title);
		
		//validation point:
		if(title.equals("Google")){
			System.out.println("correct title");
		}
		else{
			System.out.println("in-correct title");
		}
	   
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit(); //quit the browser

	}
    
    @AfterTest
    public void logout(){
    	driver.quit(); //quit the browser
    	System.out.println("AfterTest");
    }

}
