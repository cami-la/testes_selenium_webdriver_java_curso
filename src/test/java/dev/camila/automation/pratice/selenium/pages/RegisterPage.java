package dev.camila.automation.pratice.selenium.pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
	//Locators
	private By emailAddressLocator = By.id("email_create");
	private By submitBtnLocator = By.id("SubmitCreate");
	private By emailLocator = By.id("email");
	private By alertAdditionalInformationLocator = By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/div[2]/p[11]");
	
	public void insertEmailToRegister() {
		if(super.isDisplayed(emailAddressLocator)) {
			type("camila001@email.com", emailAddressLocator);
			click(submitBtnLocator);
		} else {
			System.out.println("email textbox was not present");
		}
	}
	
	public String getEmailNewAccount() {
		super.waitVisibilityOfElementLocated(alertAdditionalInformationLocator);
		return super.getTextByAttribute(this.emailLocator, "value");
	}
}
