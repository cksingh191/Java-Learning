package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckVisibilityElement {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/chandrashekharsingh/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mis.epfindia.gov.in/PensionPaymentEnquiry/pensionStatus.jsp");
		
		Select s1=new Select(driver.findElement(By.xpath("//*[@id='ocode']")));
		s1.selectByVisibleText("PATNA");
		driver.findElement(By.xpath("//*[@id='estcode']")).sendKeys("00000001");
		driver.findElement(By.xpath("//*[@id='jeevan-panel']/table/tbody/tr[3]/td/button[1]")).click();
		 driver.findElement(By.tagName("Pensioners' Name"));
		System.out.println(driver.findElement(By.xpath("//*[@id=\"respDiv\"]/table[1]/tbody/tr[2]/td[1]")));

}
}