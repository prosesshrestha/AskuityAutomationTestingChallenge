package com.automationpractice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class SignInPage extends WebPageActions {
	

	Logger log = LogManager.getLogger(SignInPage.class.getSimpleName());
	
	public SignInPage() {
		super(SignInPage.class.getSimpleName());
	}

	public void enterEmailAddress(String value) throws Exception{
		enterValueInTextField("tbx_emailaddress", value);
	}
	
	public void clickOnCreateAnAccountBtn() throws Exception {
		clickOnElement("btn_createaccount");
	}
	
	
}
