package TestLayer;

import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.loginPage;
import pageLayer.loginPage1;

public class LoginPageTest1 extends BaseClass {
	
	@Test
	public void loginFunctionality() {
	
		initialization();		//static driectly call
		
		loginPage1 obj=new loginPage1();
		
		obj.loginFunctionality("Admin", "admin123");
		
	}

}
