package com.automationpractice.test;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.automationpractice.pages.AddToCartPage;
import com.automationpractice.pages.AddedToCartPage;
import com.automationpractice.pages.AddressPage;
import com.automationpractice.pages.ContinueShoppingPage;
import com.automationpractice.pages.InformationPage;
import com.automationpractice.pages.LandingPage;
import com.automationpractice.pages.PaymentPage;
import com.automationpractice.pages.ProceedToCheckOutPage;
import com.automationpractice.pages.ShippingPage;
import com.automationpractice.pages.SignInPage;
import com.automationpractice.pages.SummerDressPage;
import com.automationpractice.utils.DataUtils;
import com.automationpractice.utils.WebBrowserActions;
import com.github.javafaker.Faker;

public class RegressionTest {
	
	Logger log = LogManager.getLogger(RegressionTest.class);
	@Parameters("Browser")
	@BeforeTest(alwaysRun = true)
	public void initBrowser(String browser) {
		WebBrowserActions.initializeBrowser(browser);
		WebBrowserActions.maximizeBrowser();
		System.out.println("Test Execution Started on browser[" + "" + "] at : " + new Date());
	}
	
	@Test
	public void ShoppingPageCheckoutFunctionalityTest() throws Exception {
		LandingPage lp = new LandingPage();
		lp.launchWebsite();
		lp.hoverOverWomenTab();
		lp.clickOnSummerDressBtn();
		
		SummerDressPage summerDress = new SummerDressPage();
		summerDress.mouseOverToPrintedSummerDress();
		summerDress.clickOnQuickView();
		
		AddToCartPage addToCart = new AddToCartPage();
		String orderedQty = addToCart.fetchQty("value");
		String orderedDressName = addToCart.fetchDressName();
		addToCart.selectFromDropDown("S");
		addToCart.clickOnAddToCart();
		
		AddedToCartPage addedToCart = new AddedToCartPage();
		addedToCart.clickOnContinueShoppingBtn();
	
		ContinueShoppingPage shoppingPage = new ContinueShoppingPage();
		shoppingPage.hoverOverToCartBtn();
		shoppingPage.clickOnCheckOut();
		
		ProceedToCheckOutPage proceedToCheckout = new ProceedToCheckOutPage();
		proceedToCheckout.clickOnProceedToCheckout();
		
		SignInPage signIn = new SignInPage();
		String emailId = new Faker().internet().emailAddress();
		System.out.println(emailId);
		signIn.enterEmailAddress(emailId);
		signIn.clickOnCreateAnAccountBtn();
		
		InformationPage info = new InformationPage();
		info.enterFirstName(DataUtils.getFirstName());
		info.enterLastName(DataUtils.getLastName());
		info.enterPassword(DataUtils.getUniquePassword());
		info.enterAddress(DataUtils.getStreetAddress());
		info.enterCity(DataUtils.getCity());
		info.selectStateFromDropDownMenu("Arizona");
		info.enterPostalCode("84198");
		info.enterMobilePhone(RandomStringUtils.randomNumeric(10));
		info.enterAddressAlias(RandomStringUtils.randomAlphanumeric(5));
		info.clickOnRegisterBtn();
		
		AddressPage address = new AddressPage();
		address.clickOnProceedToCheckout();
		
		ShippingPage shipping = new ShippingPage();
		shipping.clickOnRadioButton();
		shipping.clickOnProceedToCheckout();
		
		PaymentPage payment = new PaymentPage();
		payment.fetchDressName(orderedDressName);
		payment.fetchQtyNumber(orderedQty);
		
	}
	
	@AfterTest(alwaysRun = true)
	public void tearDown() {
		WebBrowserActions.closeAllBrowsers();
		System.out.println("Test Execution Finished on: " + new Date());

	}
	
}
