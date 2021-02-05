package com.funlibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;
	
	public  void getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Selva\\eclipse-workspace\\Selva\\Adactin\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
    public void launchUrl(String Url) {
     driver.get(Url);
}
	
    public void fillText( WebElement element, String text) {
    	element.sendKeys(text);
	}
    
    public void click(WebElement element) {
    	element.click();
	}
    
    public void selByVisTxt(WebElement element, String text) {
    	Select select=new Select(element);
  	  	select.selectByVisibleText(text);
	}
    
    
    public void selByIndex(WebElement element, String value) {
   	Select select=new Select(element);
   	select.selectByValue(value);
	}
    
 
    public void scrollDown(WebElement element) {
    	JavascriptExecutor js=(JavascriptExecutor) driver;
    	js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
    
    public void gettext(WebElement element) {
    	String text2 = element.getText();
    	System.out.println(text2);
	}
    
public void robot() throws AWTException {
    Robot r=new Robot();
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
    r.keyPress(KeyEvent.VK_TAB);
    r.keyRelease(KeyEvent.VK_TAB);
}

public void mouseOver(WebElement element) {
    	Actions act=new Actions(driver);
    	act.moveToElement(element);
    	act.contextClick(element);
    	act.doubleClick(element);
    	act.dragAndDrop(element, element);
    }
    
    public void js(WebElement element, String text) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].setAttribute('value', text)", element);
    	js.executeScript("arguments[0].getAttribute('value')", element);
	}
}
