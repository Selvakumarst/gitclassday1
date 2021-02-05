package com.execution;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import com.funlibrary.Baseclass;
import com.pojo.BookingConfirmation;
import com.pojo.HotelBooking;
import com.pojo.LoginPage;
import com.pojo.LogoutPage;
import com.pojo.PaymentPage;
import com.pojo.SelectHotelPage;

public class Execution extends Baseclass {

public static void main(String[] args) throws AWTException, InterruptedException {
		
	Baseclass bc=new Baseclass();
      bc.getdriver();
      bc.launchUrl("https://adactinhotelapp.com/");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

      LoginPage lp=new LoginPage();
      bc.fillText(lp.getTxtusrname(), "harishdurai123");
      bc.fillText(lp.getTxtpswd(), "12345678909");
      bc.click(lp.getClklogin());
      
      HotelBooking hb=new HotelBooking();
      
      bc.selByVisTxt(hb.getSelloc(), "Melbourne");
      
      bc.selByVisTxt(hb.getSelhotels(), "Hotel Sunshine");
      
      bc.selByVisTxt(hb.getSelroom(), "Deluxe");

      bc.selByVisTxt(hb.getNor(), "3 - Three");
      
      bc.robot();
      
      bc.selByVisTxt(hb.getCpr(), "3 - Three");
      
      bc.selByVisTxt(hb.getApr(), "2 - Two");
      
      bc.click(hb.getClksrcbtn());
      
      SelectHotelPage shp=new SelectHotelPage();
      
      bc.click(shp.getClkRadioBtn());
      
      bc.click(shp.getClkContinueBtn());

      PaymentPage pp=new PaymentPage();
      
      bc.fillText(pp.getCreditcard(), "5241332219969111");
      
      bc.fillText(pp.getFname(), "Selvakumar");
      
      bc.fillText(pp.getLname(), "M");

      bc.fillText(pp.getAddress(), "6th mainroad, Thiruvanmiyur");
      
      bc.selByVisTxt(pp.getCreditcardType(), "VISA");
      
      bc.selByVisTxt(pp.getCcExpMonth(), "August");
      
      bc.selByVisTxt(pp.getCcExpYear(), "2020");      
      
      bc.fillText(pp.getCvvnum(), "522");
      
      bc.click(pp.getClkbooknow());

      
      BookingConfirmation bcn=new BookingConfirmation();
  
      Thread.sleep(3000);
      
      bc.click(bcn.getItinerary());      
      
      LogoutPage lpe=new LogoutPage();
      
      bc.click(lpe.getLogout());

}
	
}
