package com.skillrary.girlsshopping.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.skillrary.girlsshopping.genericlibs.WebActionUtil;

public class BasePage {
	
	WebDriver driver;
	WebActionUtil webActionUtil;
	
	public BasePage(WebDriver driver, WebActionUtil webActionUtil) {
		this.driver=driver;
		this.webActionUtil=webActionUtil;
		PageFactory.initElements(driver, this);
	}
}
