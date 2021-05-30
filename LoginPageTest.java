package TestLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.loginPage;

public class LoginPageTest {

WebDriver driver;
	
	@Test
	public void loginFunctionality() {
		
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		loginPage obj=new loginPage(driver);
//		
//		obj.typeUsername("admin");
//		obj.typepassword("admin123");
//		obj.loginClick();
//		
	}

}
