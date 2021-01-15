package com.automationpractice.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class AddedToCartPage extends WebPageActions{
	
	Logger log = LogManager.getLogger(AddedToCartPage.class.getSimpleName());
	
	public AddedToCartPage() {
		super(AddedToCartPage.class.getSimpleName());
	}
	
	public void clickOnContinueShoppingBtn() throws Exception {
		clickOnElement("btn_ctnshopping");
	}

}
