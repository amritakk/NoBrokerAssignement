package com.assignementQA.smoke;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.assignementQA.ui.AllowsUsTo;
import com.assignementQA.ui.HomePage;
import com.assignementQA.ui.SearchPage;
import com.assignementQA.utils.CreateSession;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test_Sample {
	
public AndroidDriver<AndroidElement> driver;
	public AllowsUsTo Allow;
	public HomePage Home;
	public SearchPage Search;
	
	@BeforeMethod
	public void preCondition(Method method) throws IOException, InterruptedException {
	driver = CreateSession.Capabilities();
     Allow= new AllowsUsTo(driver);
	 Home= new HomePage(driver);
	 Search=new SearchPage(driver);
	
	}

	//@AfterMethod
	//public void postCondition(ITestResult result) throws Exception {

	//driver.closeApp();
	//}

	
	@Test
	
	public void Test1() throws Exception {

	Allow.GetContinueButton().click();
	Home.GetBuyButton().click();
	Home.SearchButton.click();
	Search.getCityDropdown().click();
	Search.selectCity().click();
	
	Search.getLocalitySearchBox().sendKeys("Mara");
	Thread.sleep(1000);
	Search.getLocalityOption().click();
	Search.getLocalitySearchBox().sendKeys("hsr");
	Thread.sleep(1000);
	Search.getLocalityOption().click();
	
	if(Search.GetNearbyCheckbox().isSelected() == false) {
		Search.GetNearbyCheckbox().click();
	}
	Search.getTwoBhkCheckbox().click();
	Search.getThreeBhkCheckbox().click();
	
Search.getSearchButton().click();
Search.getProperty().click();
Search.getWrongInfoTab().click();
Search.getPhoneTextbox().sendKeys("1237567899");
Search.PasswordButton().click();
Search.GetPasswordTextBox().sendKeys("nobroker123");
Home.SearchButton.click();
Search.getCityDropdown().click();
Search.selectCity().click();

Search.getLocalitySearchBox().sendKeys("Mara");
Thread.sleep(1000);
Search.getLocalityOption().click();
Search.getLocalitySearchBox().sendKeys("hsr");
Thread.sleep(1000);
Search.getLocalityOption().click();

if(Search.GetNearbyCheckbox().isSelected() == false) {
	Search.GetNearbyCheckbox().click();
}
Search.getTwoBhkCheckbox().click();
Search.getThreeBhkCheckbox().click();

Search.getSearchButton().click();
Search.getProperty().click();
Search.getWrongInfoTab().click();
Search.WhatsWrong().click();
	
	}
}
	


