package org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void loadDriver() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
public static void loadurl(String url) {
	driver.get(url);
}
public void fill(WebElement element, String email) {
	element.sendKeys(email);
}

public void buttonClick(WebElement element) {
element.click();

}
}
