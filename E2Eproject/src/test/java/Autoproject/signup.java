package Autoproject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageobjects.signupobjects;
import resources.dataexcel;

public class signup extends basebrowse {
	
	@BeforeTest
	public void initiateurl() throws IOException{
		driver=	initilizedriver();
		driver.get(prop.getProperty("url"));
	}
	
	
	
	
	
	@Test
	public void signup() throws IOException
	{
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		dataexcel data= new dataexcel(driver);
	ArrayList celldata=	data.getdata("signup");
//	System.out.println(celldata.get(0));
	System.out.println(celldata.get(1));
//	System.out.println(celldata.get(2));
	signupobjects ob= new signupobjects(driver);
	ob.register_click().click();
	String firstname= (String) celldata.get(1);
	ob.first().sendKeys(firstname);
//	ob.first().sendKeys(celldata.get(1));
	
	//driver.findElement(By.xpath("")).sendKeys(celldata.get(1));
	
	
	}
	@AfterTest
	public void closebrowser()
	{
	//	driver.close();
}
}
