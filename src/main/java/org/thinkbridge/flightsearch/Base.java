package org.thinkbridge.flightsearch;

import java.io.FileInputStream;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver initalizeDriver() throws Exception
	{
		prop = new Properties();
		//String filePath= "C:\\Users\\Dell\\Desktop\\Workspace\\FlightSearch\\src\\main\\java\\org\\thinkbridge\\flightsearch\\globalData.prop";
		String filePath= System.getProperty("user.dir") + "\\src\\main\\java\\org\\thinkbridge\\flightsearch\\globalData.prop";
		FileInputStream fis = new FileInputStream(filePath);
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		//String browserDriverPath = "C:\\Users\\Dell\\Desktop\\Workspace\\FlightSearch\\drivers\\ChromeDriver\\chromedriver.exe";
		String browserDriverPath =System.getProperty("user.dir") + "\\drivers\\ChromeDriver\\chromedriver.exe";
		if (browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",browserDriverPath );
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		return driver;
		
			
		
	}

}
