package com.automationpractice.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.automationpractice.utils.WebPageActions;

public class LandingPage extends WebPageActions {

	Logger log = LogManager.getLogger(LandingPage.class.getSimpleName());
	
	public LandingPage() {
		super(LandingPage.class.getSimpleName());
	}

	public void launchWebsite() {
		launchUrl(URL);
		
	}

	public void hoverOverWomenTab() throws Exception {
		hoverToElement("btn_women");
	}

	public void clickOnSummerDressBtn() throws Exception {
		hoverToElementAndClick("btn_summerdress");
	}

}