package com.automationpractice.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class AddressPage extends WebPageActions{

	Logger log = LogManager.getLogger(AddressPage.class.getSimpleName());
	
	public AddressPage() {
		super(AddressPage.class.getSimpleName());
	}
	
	public void clickOnProceedToCheckout() throws Exception {
		clickOnElement("btn_proceedtocheckout");
	}
	
	
}
