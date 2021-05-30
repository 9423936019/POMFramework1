package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.PIMHomePage;
import pageLayer.loginPage;
import pageLayer.loginPage1p;

public class PIMHomePageTest extends BaseClass {
	PIMHomePage PIMHomePage;
	loginPage1p loginPage1p;
	
	@BeforeClass
	public void setUp()
	{
		initialization();
		loginPage1p = new loginPage1p();
		loginPage1p.loginFunction("Admin","admin123");
		loginPage obj=new loginPage(driver);

		PIMHomePage=new PIMHomePage();
		
	}
	@Test
	public PIMHomePage employeeDatails()
	{
		PIMHomePage.clickOnEditBtn();
		PIMHomePage.enterDetails("MS");
	
		return new PIMHomePage();
	}
	@AfterClass
	public void tearDown()
	{
		driver.close();
	}
}
