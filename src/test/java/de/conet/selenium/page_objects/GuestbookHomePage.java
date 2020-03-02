package com.lazerycode.selenium.page_objects;

import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import org.openqa.selenium.By;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;

public class GuestbookHomePage {
	Query welcomeMessage = new Query().defaultLocator(By.id("welcome"));
	Query aboutLink = new Query().defaultLocator(By.id("about"));
	
	public GuestbookHomePage()  throws Exception{
		initQueryObjects(this, DriverBase.getDriver());
	}
	public boolean welcomeMessageIsDisplayed() {
		return welcomeMessage.findWebElement().isDisplayed();
	}
	
	public GuestBookAboutPage gotoAboutPage() throws Exception {
		aboutLink.findWebElement().click();
		return new GuestBookAboutPage();
	}

}
