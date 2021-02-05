package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.funlibrary.Baseclass;

public class HotelBooking extends Baseclass{

	public HotelBooking() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="location")

	private WebElement selloc;


	@FindBy(id="hotels")

	private WebElement selhotels;

	@FindBy(xpath="//select[@name='room_type']")

	private WebElement selroom;

	@FindBy(id="room_nos")

	private WebElement nor;

	@FindBy(id="adult_room")

	private WebElement apr;
	
	@FindBy(id="child_room")
	
	private WebElement cpr;
	
	@FindBy(id="Submit")
	
	private WebElement clksrcbtn;
	
	public WebElement getSelloc() {
	
		return selloc;
	}

	public WebElement getSelhotels() {
		return selhotels;
	}

	public WebElement getSelroom() {
		return selroom;
	}


	public WebElement getNor() {
		return nor;
	}


	public WebElement getApr() {
		return apr;
	}


	public WebElement getCpr() {
		return cpr;
	}


	public WebElement getClksrcbtn() {
			return clksrcbtn;
	}

}
