package TestLayer;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseLayer.BaseClass;
import pageLayer.loginPage1p;

public class loginPageTest1p extends BaseClass{

	@Test
	public void loginFunction()
	{
		initialization();
		
		loginPage1p obj=new loginPage1p();
		
		obj.loginFunction("Admin","admin123");
	}
}
