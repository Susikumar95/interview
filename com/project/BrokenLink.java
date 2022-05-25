package com.project;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class BrokenLink {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aysegul Akdeniz\\eclipse-workspace\\JavaIDE\\Drivers\\"
				+ "chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("https://beales.co.uk/");	
		
		
		List<WebElement> link = d.findElements(By.tagName("a"));
		int size = link.size();
		System.out.println("total links is " + size);
	
	int rescode=0;
		for (int i = 0; i <size ; i++) {
			String attribute = link.get(i).getAttribute("href");
			System.out.println(attribute);
			Thread.sleep(1000);
			
			if(attribute!=null) {
				
				URL url=new URL(attribute);
				URLConnection openConnection = url.openConnection();
				
				HttpURLConnection c =(HttpURLConnection)openConnection;
				
				int responseCode = c.getResponseCode();
				
				
				if(responseCode!=200) {
					rescode++;
					
				System.out.println("broken code is" +attribute);
				}
			}
		
		}
		System.out.println("total broken code" + rescode);

		
		
		
	}
	
	
	
}
