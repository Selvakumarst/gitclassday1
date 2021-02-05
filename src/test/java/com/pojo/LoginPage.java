package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.funlibrary.Baseclass;

public class LoginPage extends Baseclass {
public LoginPage() {
	
	PageFactory.initElements(driver, this);
	
}
	
@FindBy(id="username")

private WebElement txtusrname;

@FindBy(id="password")

private WebElement txtpswd;


@FindBy(id="login")

private WebElement clklogin;

public WebElement getTxtusrname() {
	return txtusrname;
}

public WebElement getTxtpswd() {
	return txtpswd;
}

public WebElement getClklogin() {
	return clklogin;
}

}
