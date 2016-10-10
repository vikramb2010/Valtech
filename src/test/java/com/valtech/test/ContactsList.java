package com.valtech.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.valtech.pages.HomePage;

public class ContactsList extends HomePage {
	
	
	@Test
	public static void contactsList() throws Exception {
		homePage();
		driver.findElement(By.xpath(".//*[@id='contacticon']/div/div/div[1]/i")).click();
		
		/*java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		 
		System.out.println(links.size());*/
		
		List<WebElement> xpath = driver.findElements(By.xpath("//*[@id='contactbox']/div/*"));
		//List<WebElement> xpath = driver.findElements(By.xpath("html/body/div[1]/header/div/nav/div/div[3]/div/div[*]"));
		int xpathCount = xpath.size();
		System.out.println("Total Number of Offices " + xpathCount);
	


	}
}
