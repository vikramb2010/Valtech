package com.valtech.test;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.valtech.artifacts.ReadProperty;
import com.valtech.pages.HomePage;

public class View_LatestNews extends HomePage  {
	
	@Test
	public static void testviewlatestnews() throws Exception {
		homePage();
		assertEquals(driver.findElement(By.xpath(ReadProperty.latestnews_xpath)).getText(),"LATEST NEWS", "Latest news is missing from Home screen");
	/*	
	 * This will check “Latest News” section is displaying in Home page
	 * If Latest News not present in the Home page "Latest news is missing from Home screen" message displayed
	 * latestnews_xpath is stored in the ReadProperty class
	*/
	}
	

}
