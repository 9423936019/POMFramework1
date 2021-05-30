package TestLayer;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.PIMHomePage;
import pageLayer.PIMpage1p;
import pageLayer.loginPage1p;

public class PIMpageTest1p extends BaseClass {
	loginPage1p loginPage1p;
	PIMpage1p PIMpage1p;
	PIMHomePage PIMHomePage;
	
	@BeforeClass
	public void setup()
	{
		BaseClass.initialization();
		loginPage1p = new loginPage1p();
		loginPage1p.loginFunction("Admin","admin123");
		
		PIMpage1p = new PIMpage1p();
		PIMHomePage=new PIMHomePage();
	}
	@Test
	public void verifyPIM() throws InterruptedException
	{
		
		PIMpage1p.mouseOver();
		PIMpage1p.enterDetail("Mahendra","Chavan");

		PIMHomePage.clickOnEditBtn();
		PIMHomePage.enterDetails("MS");	
	}
	
	@AfterClass
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(2000);
	//	driver.close();
	}
}
