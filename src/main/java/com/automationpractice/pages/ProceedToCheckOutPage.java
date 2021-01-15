package com.automationpractice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class ProceedToCheckOutPage extends WebPageActions {

	Logger log = LogManager.getLogger(ProceedToCheckOutPage.class.getSimpleName());
	
	public ProceedToCheckOutPage() {
		super(ProceedToCheckOutPage.class.getSimpleName());
	}
	
	public void clickOnProceedToCheckout() throws Exception {
		clickOnElement("btn_proceedtocheckout");
	}
	
}
