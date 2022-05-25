package com.sele;

import java.io.File;

import java.io.IOException;
import java.util.logging.FileHandler;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotsss {

	public static void main(String[] args) throws IOException {
		
		
		// TODO Auto-generated method stub

		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Aysegul Akdeniz\\eclipse-workspace\\JavaIDE\\Drivers\\chromedriver.exe" );
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");	
		
		
		TakesScreenshot ss= (TakesScreenshot)d;
		File scr = ss.getScreenshotAs(OutputType.FILE);
		File dtn =new File("E:\\.png");
		
		
		
		
		
	//FileUtils.copyFile(scr, dtn);
	//	FileHandler.copy(scr, new File("D:/reports/screenshot.png"));
		
		//WebElement findElement = d.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
	}

}
