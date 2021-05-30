package TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.AdminPage;
import pageLayer.HomePage;
import pageLayer.loginPage1;

public class AdminPageTest extends BaseClass {

	loginPage1 loginpage;
	HomePage homepage;
	AdminPage adminpage;
	
	
	@BeforeClass
	public void setup() {
		
		BaseClass.initialization();
		loginpage = new loginPage1();
		loginpage.loginFunctionality("Admin", "admin123");
		homepage = new HomePage();
		
		 adminpage=new AdminPage();		
	}
	@Test
	public void AdminVerify() throws InterruptedException {
		
		Thread.sleep(4000);
		adminpage.CreateUser();
		
	}
	
	@Test
	public void addNewuser() throws InterruptedException {
		
		Thread.sleep(4000);
	//	adminpage.enterEmpName("Amit pandit");
	}

}
