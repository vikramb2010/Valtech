package com.valtech.test;

import org.testng.annotations.Test;

import com.valtech.artifacts.ReadProperty;
import com.valtech.pages.HomePage;

public class TopNavigation  extends HomePage {
	

	@Test
	public static void testviewlatestnews() throws Exception {
		homePage();
		ReadProperty rp = new ReadProperty();
		clickTopNav(rp.topNavigation_xpath,rp.header);
		clickTab(rp.cases,rp.cases_heading);
		clickTopNav(rp.topNavigation_xpath,rp.header);
		clickTab(rp.services, rp.services_heading);
		clickTopNav(rp.topNavigation_xpath,rp.header);
		clickTab(rp.jobs,rp.jobs_heading);
		
	}
}