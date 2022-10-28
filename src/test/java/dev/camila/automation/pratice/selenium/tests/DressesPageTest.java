package dev.camila.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.camila.automation.pratice.selenium.pages.DressesPage;

class DressesPageTest {
	private DressesPage dressesPage;
	private final String URL = "http://automationpractice.com/index.php";

	@BeforeEach
	void setUp() throws Exception {
		this.dressesPage = new DressesPage();
		this.dressesPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		//this.dressesPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.dressesPage.viewCasualDressesPage();
		
		//then
		Assertions.assertEquals("CASUAL DRESSES ", this.dressesPage.getTitlePage());
		Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
	}
}
