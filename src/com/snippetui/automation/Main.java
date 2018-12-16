package com.snippetui.automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.paulhammant.ngwebdriver.ByAngular;
import com.paulhammant.ngwebdriver.NgWebDriver;

public class Main {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "src/com/snippetui/automation/drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		NgWebDriver ngWebDriver = new NgWebDriver(driver);
		driver.get("localhost:4200");
		ngWebDriver.waitForAngularRequestsToFinish();
		ByAngular.Factory baf = ngWebDriver.makeByAngularFactory();
		WebElement element = driver.findElement(ByAngular.buttonText("Create"));
		element.click();
		
	}
}
