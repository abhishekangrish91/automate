package Autoproject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import junit.framework.Assert;
import pageobjects.landingpage;
import pageobjects.login;

public class navigation extends basebrowse{
	
	@BeforeTest
	public void initiateurl() throws IOException{
		driver=	initilizedriver();
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider="getData")
	public void homepagenavigate(String email, String password, String text) throws IOException
	{
//	driver=	initilizedriver();
//	driver.get(prop.getProperty("url"));
	landingpage lp= new landingpage(driver);
	//compare expected with actual value
	
//	lp.gettitle().getText();
	lp.clicklogin().click();
	Assert.assertEquals(lp.gettitle().getText(),"Welcome, Please Sign In!");
	login lg= new login(driver);
	lg.enteremail().sendKeys(email);
	lg.enterpassword().sendKeys(password);
	System.out.println(text);
	lg.click_login().click();
//	lp.menubar().isDisplayed();
	Assert.assertTrue(lp.menubar().isDisplayed());
	//Assert.assertFalse(false);
	
	
	
		
	}
	@DataProvider
	//row stands for how many different data have to assign it as 1 but will start in declaration as 0
	//column stand for number of values for each test
	public Object[][] getData() {
		Object[][] data= new Object[1][3];
		data[0][0]="abhishek@yopmail.com";
		data[0][1]="@1Abhi1991";
		data[0][2]="Valid user";
		
		return data;
		
	}
	@AfterTest
	public void closebrowser()
	{
		driver.close();
	}
}
