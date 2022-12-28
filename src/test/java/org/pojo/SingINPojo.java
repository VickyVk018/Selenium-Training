package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingINPojo extends BaseClass {

	public SingINPojo() {
		
		PageFactory.initElements(driver, this);	
		
	}
	
	@FindBy(xpath ="//a[text()='Create New Account']")
	private WebElement createNewAcc;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
    private WebElement firstNameTxtBox;
	
	@FindBy(name = "lastname")
    private WebElement secondNameTxtBox;
	
	@FindBy(name = "reg_email__")
    private WebElement mobOrEmailTxtBox;
	
	@FindBy(name = "reg_passwd__")
    private WebElement newPassTxtBox;
	
	
	

	public WebElement getCreateNewAcc() {
		return createNewAcc;
	}

	public WebElement getFirstNameTxtBox() {
		return firstNameTxtBox;
	}

	public WebElement getSecondNameTxtBox() {
		return secondNameTxtBox;
	}

	public WebElement getMobOrEmailTxtBox() {
		return mobOrEmailTxtBox;
	}

	public WebElement getNewPassTxtBox() {
		return newPassTxtBox;
	}
	

}
