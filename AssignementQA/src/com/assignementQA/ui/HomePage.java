package com.assignementQA.ui;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {
	
public HomePage(AppiumDriver driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Buy']")
	public WebElement BuyButton;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Search up to 3 Localities or Landmarks']")
	public WebElement SearchButton;
	
	public WebElement GetBuyButton() {
		
		return BuyButton;
	}
	
	public WebElement GetSearchButton() {
		
		return SearchButton;
	}

	
}
