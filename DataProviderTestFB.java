package TestLayer;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Util.ExcelReader;
import baseLayer.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageLayer.FBIDLoginPage;

public class DataProviderTestFB extends BaseClass {
	
	@Test(dataProvider="testdata")
	public void loginFunctionality(String fName,String lName,String Mob,String nPass) throws InterruptedException {
		
		BaseClass.initialization();
		
		FBIDLoginPage fbidLoginPage=new FBIDLoginPage();
		fbidLoginPage.loginFunctionality(fName, lName,Mob,nPass );
//		ass")).sendKeys(password);
//		
		driver.close();
	}
	@DataProvider(name="testdata")
	public Object [][] getData() throws Exception{
		
	//relation between ExcelReader and DataProvider hare,we have create object of that class.	
		ExcelReader obj=new ExcelReader("D:\\projects\\POMFramewrok\\src\\main\\java\\ConfiLayer\\ExcelSheet.xlsx");
		
		int totalRowsCount=obj.lastRowCount(2);
		
		Object data[][]=new Object[totalRowsCount][4];
		
		for(int i=0;i<totalRowsCount;i++) {
			
			data[i][0]=obj.getData(2,i, 0);
			data[i][1]=obj.getData(2,i, 1);
			data[i][2]=obj.getData(2,i, 2);
			data[i][3]=obj.getData(2,i, 3);
		}
		return data;
	}

}
