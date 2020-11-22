package com.assignementQA.ui;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AllowsUsTo {

	public AllowsUsTo(AndroidDriver<AndroidElement> driver) {
		
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//android.widget.TextView[@text='Continue']")
	public WebElement ContinueButton;
	
	
	public WebElement GetContinueButton() {
		// TODO Auto-generated method stub
		return ContinueButton;
	}

	}


