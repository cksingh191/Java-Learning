package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayObject {
	public static long imwait=20;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/chandrashekharsingh/Downloads/chromedriver");	
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(imwait, TimeUnit.SECONDS);
		String title=driver.getTitle();
		System.out.println(title);
		boolean display=driver.findElement(By.id("u_0_11")).isDisplayed();
		System.out.println(display);
		if(display==true) {
			System.out.println("Sign Up Button is Displayed");
		}else {
			System.out.println("Sign Up Button is NOT Displayed");
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='u_0_a']")).click();
		boolean select=driver.findElement(By.xpath("//input[@id='u_0_a']")).isEnabled();
		System.out.println("Radio Button is Selected"+select);
		
		
		//driver.quit();

	}

}
