package SeleniumTestScript;

import SupportComponent.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		Xls_Reader reader=new Xls_Reader("/Chandra_Workspace/JavaSelenium/testScript/TestData/HalfEbayTestData.xlsx");
		
		String firstName=reader.getCellData("RegTestData", "firstname", 2);
		System.out.println(firstName);
		String lastname=reader.getCellData("RegTestData", "lastname", 2);
		System.out.println(lastname);
		String address1=reader.getCellData("RegTestData", "address1", 2);
		System.out.println(address1);
		String address2=reader.getCellData("RegTestData", "address2", 2);
		System.out.println(address2);
		String city=reader.getCellData("RegTestData", "city", 2);
		System.out.println(city);
		String state=reader.getCellData("RegTestData", "state", 2);
		System.out.println(state);
		String zipcode=reader.getCellData("RegTestData", "zipcode", 2);
		System.out.println(zipcode);

	}

}
