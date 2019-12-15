package SeleniumTestScript;

import SupportComponent.Xls_Reader;

public class ParameterizeTest {

	public static void main(String[] args) {
		
		Xls_Reader reader=new Xls_Reader("/Chandra_Workspace/JavaSelenium/testScript/TestData/HalfEbayTestData.xlsx");
         
		int rowCount=reader.getRowCount("RegTestData");
		for(int rowNum=2;rowNum<=rowCount;rowNum++) {
			
			String firstName=reader.getCellData("RegTestData", "firstname", rowNum);
			System.out.println(firstName);
			String lastname=reader.getCellData("RegTestData", "lastname", rowNum);
			System.out.println(lastname);
			String address1=reader.getCellData("RegTestData", "address1",rowNum);
			System.out.println(address1);
			String address2=reader.getCellData("RegTestData", "address2", rowNum);
			System.out.println(address2);
			String city=reader.getCellData("RegTestData", "city", rowNum);
			System.out.println(city);
			String state=reader.getCellData("RegTestData", "state", rowNum);
			System.out.println(state);
			String zipcode=reader.getCellData("RegTestData", "zipcode", rowNum);
			System.out.println(zipcode);
		}
	}

}
