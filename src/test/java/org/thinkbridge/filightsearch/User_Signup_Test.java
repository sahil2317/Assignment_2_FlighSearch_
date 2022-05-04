package org.thinkbridge.filightsearch;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.thinkbridge.flightsearch.Base;
import org.thinkbridge.flightsearch.SignupPage;
import org.thinkbridge.flightsearch.Validation;



public class User_Signup_Test extends Base{


	public String actualTextForRecievedMail ="A welcome email has been sent. Please check your email.";
	public String actualDropdownFirstValue= "English";
	public String actualDropdownSecondValue = "Dutch";
	public String full_Name="Sahil Mehta";
	public String org_Name= "Sahil Mehta PVT LTD";
	public String eMailId="abc@test.com";
	
	@BeforeTest
	public void initialize() throws Exception
	{
		driver = initalizeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void flightSearchSignUp() throws Exception
	{

		SignupPage sp = new SignupPage(driver);
		Validation validate  = new  Validation(driver);

		validate.enableDropdown().click();
		Assert.assertEquals(validate.validateFirstDropdownValue(),actualDropdownFirstValue);
		Assert.assertEquals(validate.validateSecondDropdownValue(),actualDropdownSecondValue);

		sp.getFullName().sendKeys(full_Name);
		sp.getOrgName().sendKeys(org_Name);
		sp.getEmail().sendKeys(eMailId);
		sp.selectAgreeCheckbox().click();
	
		sp.clickOnGetStartedButton().click();
		Thread.sleep(2000);
		Assert.assertEquals(validate.validateReceivedMail(),actualTextForRecievedMail);
		System.out.println("Mail is received Successfully");


	}

	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
}

