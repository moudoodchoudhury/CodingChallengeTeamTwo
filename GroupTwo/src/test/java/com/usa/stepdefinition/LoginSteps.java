package com.usa.stepdefinition;

import org.testng.Assert;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;
import com.usa.baseclass.SuperClass;
import com.usa.pages.HomePage;
import com.usa.pages.LoginPage;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends SuperClass {

	LoginPage lpage;
	HomePage hpage;

	@Given("^user can open browser$")
	public void user_can_open_browser() {
		initialization();
		lpage = new LoginPage();
		hpage= new HomePage();
	}

	@When("^user can launch the url \"([^\"]*)\"$")
	public void user_can_launch_the_url(String url) {
		driver.get(url);
	}

	@When("^user clicks on Signin button$")
	public void user_clicks_on_Signin_button() {
		lpage.getClkSigninBtn().click();

	}

	@When("^user enters email as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_email_and_password(String email, String password) {
		lpage.getEnterEmail().sendKeys(email);
		lpage.getEnterPsw().sendKeys(password);
	}

	@When("^user submit signin$")
	public void user_submit_signin() {

		lpage.getSubmitSignIn().click();

	}

	@When("^user varify the homepage title$")
	public void user_varify_the_homepage_title() {
		String title = lpage.HomePageVerification();
		System.out.println(title);
		Assert.assertEquals(title, "My account - My Store");
		

	}
	
}
