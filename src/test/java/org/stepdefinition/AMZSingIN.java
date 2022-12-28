package org.stepdefinition;

import java.util.List;

import org.base.BaseClass;
import org.pojo.AMZSignINPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AMZSingIN extends BaseClass {

	AMZSignINPojo a;

	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {

		launchBrowser();
		windowMaximize();
	}

	@When("To launch the url of amazon application")
	public void to_launch_the_url_of_amazon_application() {

		launchUrl("https://www.amazon.in/");
	}

	@When("To click the hello signin button")
	public void to_click_the_hello_signin_button() {

		a = new AMZSignINPojo();
		clickBtn(a.getHelloSignInBtn());
	}

	@When("To pass valid email in email field")
	public void to_pass_valid_email_in_email_field(io.cucumber.datatable.DataTable d) {

		List<String> l = d.asList();
		a = new AMZSignINPojo();
		passText(l.get(0), a.getEmail());
	}

	@When("To click the continue button")
	public void to_click_the_continue_button() throws InterruptedException {

		Thread.sleep(10000);
		
		a = new AMZSignINPojo();
		clickBtn(a.getContiBtn());
	}

	@When("To pass invalid password in password field")
	public void to_pass_invalid_password_in_password_field(io.cucumber.datatable.DataTable d) {

		List<List<String>> l = d.asLists();
		a = new AMZSignINPojo();
		passText(l.get(1).get(0), a.getPass());
	}

	@When("To click the signin button")
	public void to_click_the_signin_button() {

		a = new AMZSignINPojo();
		clickBtn(a.getSingInBtn());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {

		System.out.println("Chech your signin credential");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {

		// closeEntireBrowser();
	}
}