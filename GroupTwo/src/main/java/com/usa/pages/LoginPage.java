package com.usa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.usa.baseclass.SuperClass;

public class LoginPage extends SuperClass {

	public LoginPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//*[@class='login']")
	@CacheLookup
	private WebElement ClkSigninBtn;
	
	@FindBy(xpath="(//*[@data-validate='isEmail'])[2]")
	@CacheLookup
	private WebElement EnterEmail;
	@FindBy(xpath="(//*[@class='is_required validate account_input form-control'])[3]")
	@CacheLookup
	private WebElement EnterPsw;
	
	@FindBy(xpath="//*[@class='icon-lock left']")
	@CacheLookup
	private WebElement submitSignIn;

	public WebElement getClkSigninBtn() {
		return ClkSigninBtn;
	}

	public WebElement getEnterEmail() {
		return EnterEmail;
	}

	public WebElement getEnterPsw() {
		return EnterPsw;
	}

	public WebElement getSubmitSignIn() {
		return submitSignIn;
	}
	public String HomePageVerification() {
		return driver.getTitle();
		
		
	}
	

	
	
}
