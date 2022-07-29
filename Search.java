package com.mindtree.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://tide.com/en-us");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//it goes to the website and a pop up screen is displayed this command helps to close the pop up
		driver.findElement(By.xpath("//*[@class=\"lilo3746-close-link lilo3746-close-icon\"]")).click();
		//it helps to search a product in the website
		driver.findElement(By.xpath("//*[@type=\"search\"]")).sendKeys("Tide");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		System.out.println("First testcase run successfully");
		//this command helps to navigate to the home page
		driver.findElement(By.xpath("//*[@class=\"header-logo d-flex\"]")).click();
		//it helps to navigate to the shop page
		driver.findElement(By.xpath("//*[@class=\"menu-item hidden-submenu\"]")).click();
		System.out.println("Second testcase run successfully");  
		//it helps to navigate to the live chat page in the website
		driver.findElement(By.xpath("//a[@href='/en-us/live-chat']")).click();
		driver.findElement(By.xpath("//*[@id=\"livechat_block\"]")).click();
		System.out.println("Third testcase run successfully");
	}

}
