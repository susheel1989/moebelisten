package com;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class NodeScript {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		WebDriver driver;
		
		DesiredCapabilities caps=DesiredCapabilities.firefox();

		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
		
		
		driver.get("http://www.google.com/");
		WebElement txtbox=driver.findElement(By.id("lst-ib"));
		txtbox.sendKeys("Hello finance  Sir");
		System.out.println("DOne");
		Thread.sleep(5000);
		
		driver.quit();
	

		
	}

}
