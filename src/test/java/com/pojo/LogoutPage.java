package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.funlibrary.Baseclass;

public class LogoutPage extends Baseclass {

	public LogoutPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	public WebElement getLogout() {
		return logout;
	}

	@FindBy(id="logout")
	
	private WebElement logout;
	
}
