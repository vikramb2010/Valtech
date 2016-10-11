package com.valtech.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.valtech.artifacts.ReadProperty;
import com.valtech.pages.HomePage;

public class ContactsList extends HomePage {
	
	
	@Test
	public static void contactsList() throws Exception {
		homePage();
		driver.findElement(By.xpath(ReadProperty.contact)).click();
		List<WebElement> css = driver.findElements(By.cssSelector(".contactcities>li"));
		int officecount = css.size();
		System.out.println("Total Number of  ValTech Offices " + officecount);
		}
}
