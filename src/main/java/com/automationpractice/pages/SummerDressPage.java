package com.automationpractice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class SummerDressPage extends WebPageActions {
	
	Logger log = LogManager.getLogger(SummerDressPage.class.getSimpleName());
	
	public SummerDressPage() {
		super(SummerDressPage.class.getSimpleName());
	}
	
	
	public void mouseOverToPrintedSummerDress() throws Exception {
		hoverToElement("btn_printedsummerdress");
	}
	
	public void clickOnQuickView() throws Exception {
		clickOnElement("btn_quickview");
	}

}
