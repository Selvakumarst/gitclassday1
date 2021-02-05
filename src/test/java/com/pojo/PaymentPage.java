package com.pojo;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.funlibrary.Baseclass;

public class PaymentPage extends Baseclass{

public PaymentPage() {
	
	PageFactory.initElements(driver, this);
	
}

@FindBy (id="first_name")

WebElement fname;

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getAddress() {
	return address;
}

public WebElement getCreditcard() {
	return creditcard;
}

public WebElement getCreditcardType() {
	return creditcardType;
}

public WebElement getCcExpMonth() {
	return ccExpMonth;
}

public WebElement getCcExpYear() {
	return ccExpYear;
}

public WebElement getCvvnum() {
	return cvvnum;
}

@FindBy (id="last_name")

WebElement lname;

@FindBy (id="address")

WebElement address;

@FindBy (id="cc_num")

WebElement creditcard;

@FindBy (id="cc_type")

WebElement creditcardType;

@FindBy (id="cc_exp_month")

WebElement ccExpMonth;

@FindBy (id="cc_exp_year")

WebElement ccExpYear;

@FindBy (id="cc_cvv")

WebElement cvvnum;

@FindBy (id="book_now")

WebElement clkbooknow;

public WebElement getClkbooknow() {
	return clkbooknow;
}



}
