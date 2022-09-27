package com.cucumberFramework.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.cucumberFramework.helper.WaitHelper;

public class ValidateSubscriptionPage {
	
	private WebDriver driver;
	
	@FindBy(xpath="//span[text()='English']")
	public WebElement language;
	
	@FindBy(xpath="//div[@class='packages packages Light']")
	public WebElement LightPackage;
	
	@FindBy(xpath="//div[@class='packages packages Classic']")
	public WebElement ClassicPackage;
	
	@FindBy(xpath="//div[@class='packages packages Premium']")
	public WebElement PremiumPackage;
	
	@FindBy(xpath="//div[@class='packages packages Light']/div[@class='price']/span[@class='amount']")
	public WebElement LightAmount;
	
	@FindBy(xpath="//div[@class='packages packages Light']/div[@class='price']/span[@class='currency']")
	public WebElement LightCurrency;
	
	@FindBy(xpath="//div[@class='packages packages Light']/div[@class='price']/span[@class='period']")
	public WebElement LightPeriod;
	
	@FindBy(xpath="//div[@class='packages packages Classic']/div[@class='price']/span[@class='amount']")
	public WebElement ClassicAmount;
	
	@FindBy(xpath="//div[@class='packages packages Classic']/div[@class='price']/span[@class='currency']")
	public WebElement ClassicCurrency;
	
	@FindBy(xpath="//div[@class='packages packages Classic']/div[@class='price']/span[@class='period']")
	public WebElement ClassicPeriod;
	
	@FindBy(xpath="//div[@class='packages packages Classic']/div[@class='price']/span[@class='amount']")
	public WebElement PremiumAmount;
	
	@FindBy(xpath="//div[@class='packages packages Classic']/div[@class='price']/span[@class='currency']")
	public WebElement PremiumCurrency;
	
	@FindBy(xpath="//div[@class='packages packages Classic']/div[@class='price']/span[@class='period']")
	public WebElement PremiumPeriod;
	
	@FindBy(xpath="//span[text()='Bahrain']")
	public WebElement Bahrain;
	
	@FindBy(xpath="//span[text()='KSA']")
	public WebElement KSA;
	
	@FindBy(xpath="//span[text()='Kuwait']")
	public WebElement Kuwait;
	
	@FindBy(xpath="//a[contains(@href,'bh-en')]")
	public WebElement BahrainLink;
	
	@FindBy(xpath="//a[contains(@href,'sa-en')]")
	public WebElement KSALink;
	
	@FindBy(xpath="//a[contains(@href,'kw-en')]")
	public WebElement KuwaitLink;

	
	
	WaitHelper waitHelper;
	
	public ValidateSubscriptionPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	
	public void selectLanguage(){
		this.language.click();
	}
	
	public void checkLightPackage(){
		this.LightPackage.isDisplayed();
	}
	
	public void checkClassicPackage(){
		this.ClassicPackage.isDisplayed();
	}
	
	public void checkPremiumPackage(){
		this.PremiumPackage.isDisplayed();
	}
	
	public void clickKSAButton(){
		KSA.click();
	}
	
	public void clickBahrainButton(){
		Bahrain.click();
	}
	
	public void clickKuwaitButton(){
		Kuwait.click();
	}
	
	public void clickKSAFlagButton(){
		KSALink.click();
	}
	
	public void clickBahrainFlagButton(){
		BahrainLink.click();
	}
	
	public void clickKuwaitFlagButton(){
		KuwaitLink.click();
	}
	
	
}
