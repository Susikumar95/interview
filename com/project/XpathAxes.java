package com.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aysegul Akdeniz\\eclipse-workspace\\JavaIDE\\Drivers\\chromedriver.exe" );


		WebDriver d=new ChromeDriver();
		d.get("https://demo.wpjobboard.net/wp-admin/admin.php?page=wpjb-application");

		d.findElement(By.id("wp-submit")).click();
	
	
	d.manage().window().maximize();
	
	WebElement findElement = d.findElement(By.xpath("(//td[@data-colname='E-mail'])[1]"));
	String text = findElement.getText();
	System.out.println(text);
	
	
	
	//printing previous element,, it will print all the elements which is present previously
	List<WebElement> findElements = d.findElements(By.xpath("(//td[@data-colname='E-mail'])[1]//preceding::td"));
	for (int i = 0; i < findElements.size(); i++) {
		String text2 = findElements.get(i).getText();
		System.out.println(text2 );
	}
	
	
	//printing after that element, it will print all the elements  which is present after our targetting element
	System.out.println("printing after that element");
		List<WebElement> findElementsf = d.findElements(By.xpath("(//td[@data-colname='E-mail'])[1]//following::td"));
		for (int i = 0; i < findElementsf.size(); i++) {
			String text21 = findElementsf.get(i).getText();
			System.out.println(text21);
		}
		
		
		
		
		
		
	
	
	}

}
