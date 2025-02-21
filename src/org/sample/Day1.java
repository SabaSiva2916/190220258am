package org.sample;

import java.util.List;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	public static void main(String[] args) {

		// Mention the browser
		WebDriver driver = new ChromeDriver(); // TO open chrome browser
		// WebDriver --> Interface
		// ChromeDriver ---> Class
		// driver --> It is object reference of ChromeDriver class

		// Loading the URL
		driver.get("https://www.facebook.com/");
		// get() --> which is present on WebDriver interface

		// TO get the tilte of the Webpage
		String tile = driver.getTitle();
		System.out.println(tile);

		// TO get the url after lauch

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// WedDriver -> Interface
		// get() --> to launch the browser
		// getTitle() --> used to get the title of the Webpage
		// getCurrentUrl() --> used to get the url of the Webpage
		// 8015908440
		// Sabapathi S

		// Name, Number -- attend selenium class
		List<WebElement> allLinks = driver.findElements(By.xpath("//a[@href='links']"));
		for (WebElement ele : allLinks) {
			ele.click();
		}
	}

}
