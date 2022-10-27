package dev.camila.automation.pratice.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
	private WebDriver driver;
	
	public BasePage() {
		System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public void visit(String url) {
		this.driver.get(url);
	}
	
	public String getCurrentUrl() {
		return this.driver.getCurrentUrl();
	}
	
	public void quitWebDriver() {
		this.driver.quit();
	}
	
	public WebElement findElement(By locator) {
		return this.driver.findElement(locator);
	}
	
	public void type(String input, By locator) {
		this.driver.findElement(locator).sendKeys(input);
	}
	
	public Boolean isDisplayed(By locator) {
		try {
			return this.driver.findElement(locator).isDisplayed();
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	
	public void click(By locator) {
		this.driver.findElement(locator).click();
	}
	
	public String getText(By locator) {
		return this.driver.findElement(locator).getText();
	}
}
