package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order = 1)
	//Precondition
	private void precondition2() {
		launchBrowser();
        System.out.println("Launch the browser");
	}
	
	@Before(order = 2)
	private void precondition1() {
		
        windowMaximize();
        System.out.println("Maximize the window");	
	}
	
	@Before(order = 3 , value = "@Smoke")
	private void precondition3() {
		
		System.out.println("Precondition 3");
	}
	
	@After(order = 2 , value = "@Smoke")
	//Postcondition
	private void postcondition2() {
		System.out.println("Take screenshot of scenario");
	}
	@After(order = 4)
	//Postcondition
	private void postcondition1() {
		closeEntireBrowser();
		System.out.println("Close Entire Browser");

	}
	
	
}
