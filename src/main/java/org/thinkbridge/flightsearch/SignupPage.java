package org.thinkbridge.flightsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SignupPage {

	public WebDriver driver;
	
	private By full_Name = By.xpath("//input[@id='name']");
	private By org_Name =By.xpath("//input[@id='orgName']");
	private By eMail = By.xpath("//input[@id='singUpEmail']");
	private By checkBoxText =By.xpath("//span[@class='black-color ng-binding']");
	private By clickOnGetStarted = By.xpath("//button[text()='Get Started']");
	
	public SignupPage(WebDriver driver)
	{
		 this.driver=driver;
	}

	public WebElement getFullName()
	{
		return driver.findElement(full_Name);
	}
	
	public WebElement getOrgName()
	{
		return driver.findElement(org_Name);
	}
	public WebElement getEmail()
	{
		return driver.findElement(eMail);
	}
	public WebElement selectAgreeCheckbox()
	{
	    return driver.findElement(checkBoxText);
		
	}
	public WebElement clickOnGetStartedButton()
	{
		return driver.findElement(clickOnGetStarted);
	}
	
	
}