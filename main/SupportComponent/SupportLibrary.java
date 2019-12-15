package SupportComponent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;;

public class SupportLibrary {
	public static long imwait=20;
	
	@BeforeSuite
	public void setUp() {
		
	}
	
	WebDriver driver;
	
	@BeforeMethod
	public void lounchBrowsersetUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/chandrashekharsingh/Downloads/chromedriver");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
	}
	@AfterMethod
	public void logout() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	/****** Dropdown********/
	
	public void dropdown(){
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru=");
		driver.manage().timeouts().implicitlyWait(imwait, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("Chandrashekhar");
		WebElement selectElement=driver.findElement(By.id("state"));
		Select dropdown=new Select(selectElement);
		dropdown.selectByValue("AL");
		
		}
	// ##### Check Visibility Element ###########
	
	public void checkVisibilityElent() {
	driver.get("https://www.freecrm.com/register/"); // enter URL
		
		//isDiplayed() Method:
		boolean b1 = driver.findElement(By.id("submitButton")).isDisplayed();
		System.out.println(b1); //true
		
		//before selecting checkbox --I agree
		//isEnabled() method:
		boolean b2 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b2); //false
		
		//lets make submit button enabled:
		driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox
		
		//after selecting checkbox --I agree
		//isEnabled() method:
		boolean b3 = driver.findElement(By.id("submitButton")).isEnabled();
		System.out.println(b3); //true
		
		
		//isSelected() method: only applicable for checkbox, dropdown, radiobutton
		boolean flag1 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag1); //true
				
		//de-select the checkbox-- I Agree
		driver.findElement(By.name("agreeTerms")).click(); //check I Agree checkbox

		boolean flag2 = driver.findElement(By.name("agreeTerms")).isSelected();
		System.out.println(flag2); //false	
	}
	
	/***********CaladatSelectTest*************/
	
	public void CalendarSelectTest() {
driver.get("https://www.freecrm.com/"); // enter URL
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e1) {
			
			e1.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@type='submit']")).click(); //login button
		
		driver.switchTo().frame("mainpanel");
		
		String date = "9-June-2018";
		String dateArr[] = date.split("-"); // {18,September,2017}
		String day = dateArr[0];
		String month = dateArr[1];
		String year = dateArr[2];
		
		Select select = new Select(driver.findElement(By.name("slctMonth")));
		select.selectByVisibleText(month);
		
		Select select1 = new Select(driver.findElement(By.name("slctYear")));
		select1.selectByVisibleText(year);
		
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[2]	
		//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[2]/td[6]
		
		String beforeXpath = "//*[@id='crmcalendar']/table/tbody/tr[2]/td/table/tbody/tr[";
		String afterXpath = "]/td[";
		
		final int totalWeekDays = 7;
		
		//2-1 2-2 2-3 2-4 2-5 2-6 2-7
		//3-2 3-2 3-3 3-4 3-5 3-6 3-7
		boolean flag = false;
		String dayVal = null;
		for(int rowNum=2; rowNum<=7; rowNum++){
			
			for(int colNum = 1; colNum<=totalWeekDays; colNum++){
				try{
			    dayVal =driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				}catch (NoSuchElementException e){
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}				
			}
			if(flag){
				break;
			}
			
		}
	
		
	}
	
	/*********PopupHandle**********/
	
	public void Popuphandle() {
driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click(); //click on Go btn
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please enter a valid user name")){
			System.out.println("correct alert messg");
		}
		else{
			System.out.println("in-correct alert messg");
		}
		
		alert.accept(); //click on OK btn
		
		//alert.dismiss(); //click on cancel btn
		
	}
	
	/*************DynamicWebTableHandle
	 * @throws InterruptedException **************/
	
	public void DynamicWebTableHandle() throws InterruptedException {
driver.get("https://www.freecrm.com/"); // enter URL
		
		driver.findElement(By.name("username")).sendKeys("naveenk");
		driver.findElement(By.name("password")).sendKeys("test@123");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.switchTo().frame("mainpanel");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		
		//*[@id='vContactsForm']/table/tbody/tr[4]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[5]/td[2]/a
		//*[@id='vContactsForm']/table/tbody/tr[6]/td[2]/a		
		//*[@id='vContactsForm']/table/tbody/tr[7]/td[2]/a
		
		
		//Method-1:
		String before_xpath = "//*[@id='vContactsForm']/table/tbody/tr[";
		String after_xpath = "]/td[2]/a";
		
		for(int i=4; i<=7; i++){
			String name = driver.findElement(By.xpath(before_xpath + i + after_xpath)).getText();
			System.out.println(name);
			if(name.contains("test2 test2")){ //i=6
				//*[@id='vContactsForm']/table/tbody/tr[6]/td[1]/input
				driver.findElement(By.xpath("//*[@id='vContactsForm']/table/tbody/tr["+i+"]/td[1]/input")).click();
			}
		}
		
		//Method-2:
		driver.findElement(By.xpath("//a[contains(text(),'test2 test2')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'ui uiii')]/parent::td//preceding-sibling::td//input[@name='contact_id']")).click();	
		
	}
	
	/**************DataDriverTest************/
	
	public void DataDriverTest() {
		
		
		Xls_Reader reader = new Xls_Reader("/Users/chandrashekharsingh/Documents/HalfEbayTestData copy.xlsx");

		String firstName = reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);
		
		String lastName = reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastName);
		
		String address1 = reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);
		
		String address2 = reader.getCellData("RegTestData", "address2", 2);
		System.out.println(address2);
		
		String city = reader.getCellData("RegTestData", "city", 2);
		System.out.println(city);
		
		String state = reader.getCellData("RegTestData", "state", 2);
		System.out.println(state);
		
		String zipCode = reader.getCellData("RegTestData", "zipcode", 2);
		System.out.println(zipCode);
		
		String emailAddress = reader.getCellData("RegTestData", "emailaddress", 2);
		System.out.println(emailAddress);
		
		
//webdriver code:
		//System.setProperty("webdriver.chrome.driver", "/Users/naveenkhunteta/Downloads/chromedriver");
		//WebDriver driver = new ChromeDriver(); // launch chrome
		driver.get("https://scgi.half.ebay.com/ws/eBayISAPI.dll?RegisterEnterInfo&usage=2943&ru="); // enter url
		
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys(firstName);
		
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys(lastName);
		
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address1);
		
		driver.findElement(By.xpath("//*[@id='address1']")).sendKeys(address2);
		
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys(city);

		Select select = new Select(driver.findElement(By.xpath("//*[@id='state']")));
		select.selectByVisibleText(state);
		
		driver.findElement(By.xpath("//*[@id='zip']")).sendKeys(zipCode);
		
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys(emailAddress);
		driver.findElement(By.xpath("//*[@id='retype_email']")).sendKeys(emailAddress);
		
	}
	public void excelReading() throws Exception {
		File src=new File("/Users/chandrashekharsingh/Documents/cks4.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		String data=sheet1.getRow(2).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is---"+data);
		String firstName = sheet1.getRow(1).getCell(4).getStringCellValue();
		System.out.println(firstName);
	}

	
	
}



