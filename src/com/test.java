package com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com/");
		WebElement txtbox=driver.findElement(By.id("lst-ib"));
		txtbox.sendKeys("boxspringbett");
		Thread.sleep(5000);
		WebElement site=driver.findElement(By.linkText("Boxspringbett Online Kaufen | www.möbelisten.de"));
		site.click();
		Thread.sleep(10000);
		driver.navigate().to("http://www.moebelisten.de/boxspringbett-london/");
		Thread.sleep(20000);
		
		driver.navigate().to("http://www.google.com/");
		

		
	}

}
