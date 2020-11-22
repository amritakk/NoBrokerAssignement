package com.assignementQA.ui;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.FindsByAndroidUIAutomator;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.PointOption;
import static java.time.Duration.ofSeconds;



public class SearchPage {
	WebDriver driver;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement getCityDropdown() {
		return driver.findElement(By.id("android:id/text1"));
	}

	@SuppressWarnings("unchecked")
	public WebElement selectCity()  {
		return (AndroidElement) ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bangalore\"))");
	}
	
	public WebElement getLocalitySearchBox() {
		return driver.findElement(By.id("com.nobroker.app:id/localityAutoCompleteTxt"));
	}
	
	public WebElement getLocalityOption() {
		return driver.findElement(By.id("com.nobroker.app:id/nearByRadio"));
	}
	
	public WebElement GetNearbyCheckbox() {
		return driver.findElement(By.id("com.nobroker.app:id/nearByRadio"));
	}
	
	public WebElement getTwoBhkCheckbox() {
		return driver.findElement(By.id("com.nobroker.app:id/bhktwo"));
	}
	
	public WebElement getThreeBhkCheckbox() {
		return driver.findElement(By.id("com.nobroker.app:id/bhkthree"));
	}
	
	public WebElement getSearchButton() {
		return driver.findElement(By.id("com.nobroker.app:id/searchProperty"));
	}
	
	
	public WebElement getProperty()  {
		
		return driver.findElement(By.xpath("//android.widget.TextView[@text='3 BHK in Vaswani Tranquil']"));
		
	}
	
	@SuppressWarnings("unchecked")
	public WebElement getWrongInfoTab()  {
		return (AndroidElement) ((FindsByAndroidUIAutomator<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Wrong Info\"))");
	}
	
	
	public WebElement getPhoneTextbox()  {
		return driver.findElement(By.id("signUp-phoneNumber"));
	}
	
	public WebElement PasswordButton() {
		return driver.findElement(By.xpath("//android.widget.RadioButton[@text='I've Password']"));
		
	}
	public WebElement GetPasswordTextBox() {
		return driver.findElement(By.xpath("//android.wiandroid.widget.EditText[@text=Enter Password]"));
		
	}
	public List<WebElement> WhatsWrong(){
		return driver.findElements(By.xpath("//android.widget.CheckBox"));
		
	}
}