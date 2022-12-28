package org.stepdefinition;

import io.cucumber.datatable.*;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.SingINPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbRegisteration extends BaseClass {

	SingINPojo s;
	
	@Given("To launch the browser and maximize window")
	public void to_launch_the_browser_and_maximize_window() {
	 
		launchBrowser();
		windowMaximize();
	}

	@When("To launch url of fb application")
	public void to_launch_url_of_fb_application() {
	    
		launchUrl("https://www.facebook.com/");
	}

	@When("To click the create new account button")
	public void to_click_the_create_new_account_button() throws InterruptedException {
	    
		//To slow the Execution
		Thread.sleep(3000);
		
		s = new SingINPojo();
		clickBtn(s.getCreateNewAcc());
	}

	@When("To pass firstname in firstname text box")
	public void to_pass_firstname_in_firstname_text_box(DataTable d) throws InterruptedException {
	    
		Map<String, String> m = d.asMap(String.class, String.class);
		
		Thread.sleep(5000);
		s = new SingINPojo();
		
		Thread.sleep(5000);
		passText(m.get("firstname3") , s.getFirstNameTxtBox());
	}

	@When("To pass secondname in secondname text box")
	public void to_pass_secondname_in_secondname_text_box() {
	    
		s = new SingINPojo();
		passText("Samuel", s.getSecondNameTxtBox());
	}

	@When("To pass mobile or email in email text box")
	public void toPassMobileOrEmailInEmailTextBox(io.cucumber.datatable.DataTable d) {
	    
		List<Map<String, String>> m = d.asMaps();
		
		s = new SingINPojo();
		passText(m.get(1).get("password1") , s.getMobOrEmailTxtBox());
	}

	@When("To create new password in new password text box")
	public void to_create_new_password_in_new_password_text_box() {
	
		s = new SingINPojo();
	    passText("12345", s.getNewPassTxtBox());
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
	 
		//closeEntireBrowser();	
	}
}
