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
		
	}
	

}
