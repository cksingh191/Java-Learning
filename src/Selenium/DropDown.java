package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown extends TestCase{
	//@Test
	public void dropdown() {
	driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
	driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Chandrashekhar");
	WebElement selectElement=driver.findElement(By.id("state"));
	Select dropdown=new Select(selectElement);
	dropdown.selectByVisibleText("Alaska");
	}

}
