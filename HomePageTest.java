package TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import junit.framework.Assert;
import pageLayer.HomePage;
import pageLayer.loginPage;
import pageLayer.loginPage1;

public class HomePageTest extends BaseClass{

	loginPage1 loginpage;
	HomePage homepage;

	@BeforeMethod
	public void setUp() {
		initialization();
		loginpage = new loginPage1();
		loginpage.loginFunctionality("Admin", "admin123");
		homepage = new HomePage();
	}

	@Test(priority=1)
	public void verifyHomepage() {

		Boolean actualLogo = homepage.verifyLogo();
		Assert.assertSame(actualLogo, true);

	}

	@Test(priority=2)
	public void verifytitle() {

		String actualTile = homepage.verifyTitle();
		String expectedTitle = "OrangeHRM";
		Assert.assertEquals(actualTile, expectedTitle);

	}

	@AfterMethod
	public void tearDown() {
		driver.close();
	}


}
