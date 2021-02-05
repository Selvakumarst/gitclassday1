package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.funlibrary.Baseclass;

public class SelectHotelPage extends Baseclass{

	public SelectHotelPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(id="radiobutton_0")
	
	private WebElement clkRadioBtn;
	
	@FindBy(id="continue")
	
	private WebElement clkcontinuebtn;

	public WebElement getClkRadioBtn() {
	
		return clkRadioBtn;
	}
	
	public WebElement getClkContinueBtn() {

		return clkcontinuebtn;
		
	}
	
}
