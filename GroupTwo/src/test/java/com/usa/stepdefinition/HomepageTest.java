package com.usa.stepdefinition;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import com.usa.baseclass.SuperClass;
import com.usa.pages.HomePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomepageTest extends SuperClass {

	HomePage pf;

	@When("^click on Dresses$")
	public void click_on_Dresses() {
logger.info("Click the dresses button");
		pf = PageFactory.initElements(driver, HomePage.class);
		pf.getClkDressBtn().click();
	}

	@When("^verify list of items shown on the page and print price for all the items$")
	public void verify_list_of_items_shown_on_the_page_and_print_price_for_all_the_items() {
		
		logger.info("showing 1-5 dresses");
		String expected = pf.getShowItems().getText();
		String Actual = "Showing 1 - 5 of 5 items";
		System.out.println("The expected showing items" + expected);
		if (expected.equalsIgnoreCase(Actual)) {
			System.out.println("list of 5 items verification has been matched");
		} else {
			System.out.println("list of 5 items verification did notmatched");
		}

		pf.listofprices();
	}

	@When("^select the second item from the list$")
	public void select_the_second_item_from_the_list() {
logger.info("click the second dress");
		pf.seconditems();

	}

	@When("^click on add to cart$")
	public void click_on_add_to_cart() {
		logger.info("proceeded to check out");
		pf.getProceedToCheckOut().click();
	}

	@When("^verify the total price$")
	public void verify_the_total_price() {
		
		logger.info("verify the price");
		String exptectedshippingPrice = pf.getshippingprice().getText();
		String expectedTotalPrice = pf.gettotalprice().getText();

		String ActualShippingPrice = "$2.00";
		String TotalPrice = "$52.99";

		System.out.println("Shipping price is:" + "" + exptectedshippingPrice);
		System.out.println("Total price is:" + "" + expectedTotalPrice);

		if (exptectedshippingPrice.equalsIgnoreCase(ActualShippingPrice)) {
			System.out.println("Exptected Shipping price matched with Actual");
		} else {
			System.out.println("Exptected Shipping price did not match with Acutal");
		}

		if (expectedTotalPrice.equalsIgnoreCase(TotalPrice)) {
			System.out.println("Exptected Total price matched with Actual");
		} else {
			System.out.println("Exptected Total price did not match with Acutal");
		}

	}

	@Then("^close the checkout window and logouts$")
	public void close_the_checkout_window_and_logouts() {
		logger.info("logout and closed the browser");
		pf.getlogout();
		pf.teardown();

	}
}
