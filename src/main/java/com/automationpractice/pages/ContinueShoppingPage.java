package com.automationpractice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class ContinueShoppingPage extends WebPageActions {

	Logger log = LogManager.getLogger(ContinueShoppingPage.class.getSimpleName());
	
	public ContinueShoppingPage() {
		super(ContinueShoppingPage.class.getSimpleName());
	}
	
	public void hoverOverToCartBtn() throws Exception {
		hoverToElement("lbl_cart");
	}
	
	public void clickOnCheckOut() throws Exception {
		hoverToElementAndClick("btn_checkout");
	}
	
	
	
	
	
	
}
