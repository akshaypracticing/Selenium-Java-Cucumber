package com.cucumberFramework.stepdefinitions;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.ValidateSubscriptionPage;
import com.cucumberFramework.testBase.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class ValidateSubscriptionPackageStepDefinitions extends TestBase {

	ValidateSubscriptionPage subscriptionpage = new ValidateSubscriptionPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the Subscribe page URL \"([^\"]*)\"$")
	public void i_am_on_the_Subscribe_page_URL(String arg1) throws Throwable {
		driver.get(arg1);
		//waitHelper = new WaitHelper(driver);
	}

	@When("^I click on English button to select it as language for further validations$")
	public void i_click_on_sign_in_button_and_wait_for_sign_in_page() throws Throwable {
		subscriptionpage.selectLanguage();
		//waitHelper.WaitForElement(subscriptionpage.language, 60);
	}

	@Then("^I should see Subscription page for \"([^\"]*)\"$")
	public void i_should_see_Subscription_Page() throws Throwable {
		subscriptionpage.KSA.isDisplayed();
	}

	@Then("^I validate \"([^\"]*)\"$")
	public void i_enter_username_as() throws Throwable {
		System.out.println("Package for KSA are:");
		if (subscriptionpage.KSA.isDisplayed() && subscriptionpage.LightPackage.isDisplayed()) {
			System.out.println(subscriptionpage.LightAmount.getText());
			System.out.println(subscriptionpage.LightCurrency.getText());
			System.out.println(subscriptionpage.LightPackage.getText());
		}
		else if(subscriptionpage.KSA.isDisplayed() && subscriptionpage.ClassicPackage.isDisplayed()) {
			System.out.println(subscriptionpage.ClassicAmount.getText());
			System.out.println(subscriptionpage.ClassicCurrency.getText());
			System.out.println(subscriptionpage.ClassicPeriod.getText());
		}
		else if(subscriptionpage.KSA.isDisplayed() && subscriptionpage.PremiumPackage.isDisplayed()) {
			System.out.println(subscriptionpage.ClassicAmount.getText());
			System.out.println(subscriptionpage.ClassicCurrency.getText());
			System.out.println(subscriptionpage.ClassicPeriod.getText());
		}
		subscriptionpage.clickKSAButton();
		subscriptionpage.clickBahrainFlagButton();
		System.out.println("Package for Bahrain are:");
		if (subscriptionpage.Bahrain.isDisplayed() && subscriptionpage.LightPackage.isDisplayed()) {
			System.out.println(subscriptionpage.LightAmount.getText());
			System.out.println(subscriptionpage.LightCurrency.getText());
			System.out.println(subscriptionpage.LightPackage.getText());
		}
		else if(subscriptionpage.Bahrain.isDisplayed() && subscriptionpage.ClassicPackage.isDisplayed()) {
			System.out.println(subscriptionpage.ClassicAmount.getText());
			System.out.println(subscriptionpage.ClassicCurrency.getText());
			System.out.println(subscriptionpage.ClassicPeriod.getText());
		}
		else if(subscriptionpage.Bahrain.isDisplayed() && subscriptionpage.PremiumPackage.isDisplayed()) {
			System.out.println(subscriptionpage.ClassicAmount.getText());
			System.out.println(subscriptionpage.ClassicCurrency.getText());
			System.out.println(subscriptionpage.ClassicPeriod.getText());
		}
		subscriptionpage.clickKuwaitButton();
		subscriptionpage.clickKuwaitFlagButton();
		System.out.println("Package for Kuwait are:");
		if (subscriptionpage.Kuwait.isDisplayed() && subscriptionpage.LightPackage.isDisplayed()) {
			System.out.println(subscriptionpage.LightAmount.getText());
			System.out.println(subscriptionpage.LightCurrency.getText());
			System.out.println(subscriptionpage.LightPackage.getText());
		}
		else if(subscriptionpage.Kuwait.isDisplayed() && subscriptionpage.ClassicPackage.isDisplayed()) {
			System.out.println(subscriptionpage.ClassicAmount.getText());
			System.out.println(subscriptionpage.ClassicCurrency.getText());
			System.out.println(subscriptionpage.ClassicPeriod.getText());
		}
		else if(subscriptionpage.Kuwait.isDisplayed() && subscriptionpage.PremiumPackage.isDisplayed()) {
			System.out.println(subscriptionpage.ClassicAmount.getText());
			System.out.println(subscriptionpage.ClassicCurrency.getText());
			System.out.println(subscriptionpage.ClassicPeriod.getText());
		}
		
	}

	
}