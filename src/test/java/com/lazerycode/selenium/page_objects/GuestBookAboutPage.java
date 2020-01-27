package com.lazerycode.selenium.page_objects;

import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import org.openqa.selenium.By;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;

public class GuestBookAboutPage {
	Query aboutText = new Query().defaultLocator(By.id("about"));
	Query gotoMain = new Query().defaultLocator(By.id("gotoMain"));
	public GuestBookAboutPage()  throws Exception{
		initQueryObjects(this, DriverBase.getDriver());
	}
	public boolean aboutMessageExists() {
		return aboutText.findWebElement().isDisplayed();
	}
	public GuestBookMainPage gotoMainPage() throws Exception {
		gotoMain.findWebElement().click();
		return new GuestBookMainPage();
	}
}
