package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
	public WebDriver driver;
	By email= By.xpath("//input[@id='Email']");
	By password=By.xpath("//input[@id='Password']");
	By clicklogin= By.xpath("//input[@value='Log in']");
	
	public login(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement enteremail()
	{
		return driver.findElement(email);
		
	}
	public WebElement enterpassword()
	{
		return driver.findElement(password);
	}
	public WebElement click_login()
	{
		return driver.findElement(clicklogin);
	}
			

}
