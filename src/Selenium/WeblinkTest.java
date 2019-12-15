package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WeblinkTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/chandrashekharsingh/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(3000);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		boolean display=driver.findElement(By.id("u_0_11")).isDisplayed();
		System.out.println("Sign Up Button is Displayed"+display);
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(int i=0;i<linklist.size();i++) {
			String linktext=linklist.get(i).getText();
			System.out.println(linktext);
		}
		driver.findElement(By.id("u_0_11")).sendKeys(Keys.ENTER);
		//driver.quit();
		driver.navigate().to(driver.getCurrentUrl());
		driver.findElement(By.linkText("Sign Up")).sendKeys(Keys.ENTER);
		driver.navigate().back();
		System.out.println("DONE");

	}

}
