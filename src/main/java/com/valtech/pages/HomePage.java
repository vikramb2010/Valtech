package com.valtech.pages;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HomePage {
	protected static WebDriver driver = null;
	public String baseurl = "https://www.valtech.com/";
	@BeforeTest
	public void Initiation() {
		driver = new FirefoxDriver();
		driver.get("https://www.valtech.com/");
		driver.manage().window().maximize();
	}
	
	
	public static  void homePage() {
	driver.get("https://www.valtech.com/");			
	 System.out.println(" Valtech Home page is opened");
	}
	
	
	/**
	 * ClickTopNav(String, String) is used to click on the specified tab in the top navigation bar.
	 * @param navXpath is the XPath of the specified tab.
	 * @param waitForXpath is XPath of the element present in the next page .
	 */
	
	protected static void clickTopNav(String navXpath, String waitForXpath){
		// Click Tab
		driver.findElement(By.xpath(navXpath)).click();

		// Wait for tab to load
		long StartTime = System.currentTimeMillis();
		long CurTime = System.currentTimeMillis();
		while ( true ) {
			if ((CurTime - StartTime) >= 120000) fail("timeout");
			try { if (isElementPresent(By.xpath(waitForXpath))) break; } catch (Exception e) {}
			CurTime = System.currentTimeMillis();
		}
	}
	
	/**
	 * isElementPresent() method verifies that the specified element is somewhere on the page and returns true/false accordingly.
	 * @param the "by" object passed is the element to be verified whether present or not.
	 * @return true if the element is present otherwise false.
	 * 
	 */
	
	/**
	 * clickTab() is used to click on the specified tab.
	 * @param tabXpath is the XPath of the tab.
	 * @param waitForXpath is XPath of the element present in the next page .
	 */
	protected static void clickTab(String tabXpath, String waitForXpath){
			driver.findElement(By.xpath(tabXpath)).click();
		// Wait for tab to load
		long StartTime = System.currentTimeMillis();
		long CurTime = System.currentTimeMillis();
		while ( true ) {
			if ((CurTime - StartTime) >= 120000) fail("timeout");
			try { if (isElementPresent(By.xpath(waitForXpath))) break; } catch (Exception e) {}
			CurTime = System.currentTimeMillis();
		}
	}
	
	protected static boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	    System.out.println("Valtech website is closed");
    }
}
