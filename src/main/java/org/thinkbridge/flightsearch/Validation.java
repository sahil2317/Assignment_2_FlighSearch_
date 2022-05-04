package org.thinkbridge.flightsearch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Validation {
	
	public WebDriver driver;
	
	private By recievedMailText = By.xpath("//div[@class='alert alert-danger alert-custom']//span[@class='ng-binding']");
	private By enableDropdown = By.xpath("//div[@id='language']");
	private By dropDownValueAsEnglish = By.xpath("//div[@id='ui-select-choices-row-1-0']//div[@class='ng-binding ng-scope']");
	private By dropDownValueAsDutch = By.xpath("//div[@id='ui-select-choices-row-1-1']//div[@class='ng-binding ng-scope']");	
	
	public Validation(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public String validateReceivedMail() {
		  String expectedTextForRecievedMail= driver.findElement(recievedMailText).getText();
		  System.out.println(expectedTextForRecievedMail);
		  return expectedTextForRecievedMail;
	} 
	
	public WebElement  enableDropdown()
	{
		 return driver.findElement(enableDropdown);
	}
	public String validateFirstDropdownValue() throws Exception {
		String ExpDropdownValueEnglish= driver.findElement(dropDownValueAsEnglish).getText();
		System.out.println(ExpDropdownValueEnglish);
		return ExpDropdownValueEnglish;
		
	}
	public String validateSecondDropdownValue()
	{
		
		String ExpDropdownValueDutch = driver.findElement(dropDownValueAsDutch).getText();
		System.out.println(ExpDropdownValueDutch);
		return ExpDropdownValueDutch;
	}

}

