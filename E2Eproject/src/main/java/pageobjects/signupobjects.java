package pageobjects;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signupobjects {
	public WebDriver driver;
	
	
	By register = By.xpath("//a[contains(text(),'Register')]");
	By first_name= By.xpath("//input[@id='FirstName']");
	By last_name= By.xpath("//input[@id='LastName']");
	By email= By.xpath("//input[@id='Email']");
	
	public signupobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement register_click()
	{
		return driver.findElement(register);
	}
	public WebElement first()
	{
		return driver.findElement(first_name);
	}
	public WebElement last()
	{
		return driver.findElement(last_name);
	}
	public WebElement enter_email()
	{
		return driver.findElement(email);
	}

}
