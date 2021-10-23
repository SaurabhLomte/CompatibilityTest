package com.thinkbridge.ThinkBridgeCompatibilityTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JabaTalksSignupFormValidation {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://jt-dev.azurewebsites.net/#/SignUp");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='English']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Choose Language']")).click();
		driver.findElement(By.xpath("//div[text()='English']")).click();
		driver.findElement(By.xpath("//input[@title='Enter your name here']")).sendKeys("Saurabh Lomte");
		driver.findElement(By.xpath("//input[@name='orgName']")).sendKeys("NeoSoft Technologies");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("saurabhlomte@gmail.com");
		driver.findElement(By.xpath("//span[@class='black-color ng-binding']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		

	}

}
