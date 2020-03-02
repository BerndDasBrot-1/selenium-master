package com.lazerycode.selenium.page_objects;

import static com.lazerycode.selenium.util.AssignDriver.initQueryObjects;

import org.openqa.selenium.By;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.util.Query;

public class GuestBookMainPage {
	Query firstName = new Query().defaultLocator(By.id("firstName"));
	Query lastName = new Query().defaultLocator(By.id("lastName"));
	Query addPerson = new Query().defaultLocator(By.id("addPerson"));
	Query table = new Query().defaultLocator(By.id("personTable"));
	Query rows = new Query().defaultLocator(By.xpath("/html/body/main/div/table/tbody/tr"));
	//html/body/main/div/table
	public GuestBookMainPage()  throws Exception{
		initQueryObjects(this, DriverBase.getDriver());
	}
	public GuestBookMainPage addAPerson(String personsFirstName, String personsLastName) {
		firstName.findWebElement().sendKeys(personsFirstName);
		lastName.findWebElement().sendKeys(personsLastName);
		addPerson.findWebElement().click();
		return this;
	}
	public boolean newPersonIsAdded() {
		System.out.println("Number of Rows:" + rows.findWebElements().size());
		return true;
	}
	
	
}
