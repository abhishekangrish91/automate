package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class landingpage {

	
	public WebDriver driver;
	By login= By.xpath("//a[contains(text(),'Log in')]");
	By title= By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
	
	public landingpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement clicklogin()
	{
	return driver.findElement(login);
}
	public WebElement gettitle()
	{
		return driver.findElement(title);
	}
}
