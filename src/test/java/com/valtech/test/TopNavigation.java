package com.valtech.test;

import org.testng.annotations.Test;

import com.valtech.artifacts.ReadProperty;
import com.valtech.pages.HomePage;
public class TopNavigation  extends HomePage {
	
	@Test
	public static void testviewlatestnews() throws Exception {
		homePage();
		ReadProperty rp = new ReadProperty();
		
		/**
		 * ClickTopNav(String, String) is used to click on the specified tab in the top navigation bar.
		 * @param rp.topNavigation_xpath is the XPath of the specified tab.
		 * @param rp.header is XPath of the element present in the next page .
		 * This will acts assertion for the next page 
		 */
		
		/**
		 * clickTab() is used to click on the specified tab.
		 * @param rp.cases is the XPath of the tab.
		 * @param rp.cases_heading is XPath of the element present in the next page .
		 * This will acts assertion for the next page 
		 */
		
		clickTopNav(rp.topNavigation_xpath,rp.header);
		clickTab(rp.cases,rp.cases_heading);
		
		clickTopNav(rp.topNavigation_xpath,rp.header);
		clickTab(rp.services, rp.services_heading);
		
		clickTopNav(rp.topNavigation_xpath,rp.header);
		clickTab(rp.jobs,rp.jobs_heading);
		
	}
}