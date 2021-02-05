package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.funlibrary.Baseclass;

public class BookingConfirmation extends Baseclass{

	public BookingConfirmation() {
		
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(xpath="//input[@value='My Itinerary']")
	private WebElement itinerary;
	
	public WebElement getItinerary() {
		return itinerary;
	}
	



@FindBy(xpath="(//input[@type='button'])[1]")

private WebElement srchotel;


public WebElement getSrchotel() {
	
	return srchotel;
	
}



}
