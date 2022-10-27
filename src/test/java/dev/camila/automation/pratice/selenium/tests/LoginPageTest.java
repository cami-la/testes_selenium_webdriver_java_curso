package dev.camila.automation.pratice.selenium.tests;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.camila.automation.pratice.selenium.pages.LoginPage;

class LoginPageTest {
	private LoginPage loginPage;
	private final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account";

	@BeforeEach
	void setUp() throws Exception {
		this.loginPage = new LoginPage();
		this.loginPage.visit(this.URL);
	}

	@AfterEach
	void tearDown() throws Exception {
		this.loginPage.quitWebDriver();
	}

	@Test
	void test() {
		//when
		this.loginPage.signin();
		
		//then
		Assertions.assertTrue(this.loginPage.getMyAccountMessage().equals("MY ACCOUNT"));
		Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
	}

}
