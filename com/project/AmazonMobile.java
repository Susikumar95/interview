package com.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class AmazonMobile 

{
			public static void main(String[] args) throws InterruptedException {
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");	
				
				
				driver.manage().window().maximize();
		//Thread.sleep(3000);
				driver.findElement(By.id("nav-link-prime")).click();
				
				//driver.findElement)).sendKeys("mobile");
				
				WebElement findElement = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
				findElement.sendKeys("mobile");
				
				driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

				
			List<WebElement> mobileAmts =driver.
					findElements(By.xpath("//span[@class='a-price-whole']"));
			
			
			Thread.sleep(3000);
			
			
			for (int i = 0; i <mobileAmts.size(); i++) {
				
				String text = mobileAmts.get(i).getText();
				
//				int parseInt = Integer.parseInt(text);
//				
//				
//				if(parseInt>10000) {
//					System.out.println(parseInt);
				System.out.println(text);
				}
				
				
				
			}

			
			
	//			}
}



