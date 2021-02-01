package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOClass extends BaseClass {
	public POJOClass() {
	PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='TrueBlue']")
	private WebElement logo;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private WebElement signin;
	
	@FindBy(xpath="//input[@data-qaid='emailInput']")
	private WebElement email;
	
	@FindBy(xpath="//input[@formcontrolname='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@data-qaid='loginButton']")
	private WebElement sign;

	public WebElement getLogo() {
		return logo;
	}

		public WebElement getSignin() {
		return signin;
	}

		public WebElement getEmail() {
		return email;
	}

		public WebElement getPassword() {
		return password;
	}

		public WebElement getSign() {
		return sign;
	}

}

