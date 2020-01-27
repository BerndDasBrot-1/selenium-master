package com.lazerycode.selenium.tests;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.lazerycode.selenium.DriverBase;
import com.lazerycode.selenium.page_objects.GuestBookAboutPage;
import com.lazerycode.selenium.page_objects.GuestbookHomePage;

public class GuestBookIT extends DriverBase{
	
	@Test
	public void welcomeMessageExists() throws Exception {
		  WebDriver driver = getDriver();
		  driver.get("http://localhost:8080/Guestbook/index.html");
	      GuestbookHomePage guestBookHomePage = new GuestbookHomePage();
	      boolean exists = guestBookHomePage.welcomeMessageIsDisplayed();
	      assertEquals(exists, true);
	}
	@Test
	public void gotoAboutPage() throws Exception {
		 WebDriver driver = getDriver();
		 driver.get("http://localhost:8080/Guestbook/index.html");
		 GuestbookHomePage guestBookHomePage = new GuestbookHomePage();
		 boolean check = guestBookHomePage.gotoAboutPage().aboutMessageExists();
		 assertEquals(check, true);
	}
	@Test
	public void checkPersonAdded() throws Exception{
		 WebDriver driver = getDriver();
		 driver.get("http://localhost:8080/Guestbook/about.html");
		 GuestBookAboutPage guestBookAboutPage = new GuestBookAboutPage();
		 boolean isAdded = guestBookAboutPage
				 .gotoMainPage()
				 .addAPerson("Leo", "Lausemaus")
				 .newPersonIsAdded();
		assertEquals(isAdded, true);
	}
	

}
