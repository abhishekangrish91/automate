package Autoproject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basebrowse {
	public WebDriver driver;
	@SuppressWarnings("deprecation")
	public WebDriver initilizedriver() throws IOException
	{
		Properties prop= new Properties();
		FileInputStream fis= new FileInputStream("D:\\E2Eproject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
	String browsername=	prop.getProperty("browser");//Chrome
	System.out.println(browsername);
	if(browsername.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\drive\\chromedriver.exe");
		 driver= new ChromeDriver();

      
        
	}
	else if(browsername.equals("firefox"))
	{
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\drive\\chromedriver.exe");
		 driver= new FirefoxDriver();
		
	}
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	return driver;
		
		//firefox
		
		
	}

}
