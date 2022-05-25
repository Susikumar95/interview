package com.testng;
import java.util.Date;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNgAnnot extends LibGloabal  {

	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before class--> driver initialization");
		getDriver();
		getUrl("https://www.facebook.com/"); 
		}

	@AfterClass
	public static void afterClass() {
		System.out.println("After class--> driver close");
		//closedBrowser();
	}

	@BeforeMethod
	public void before() {
		System.out.println("Before --->starting time  of execution");
		Date da=new Date();
		System.out.println(da);
	}

	@AfterMethod
	public void after() {
		System.out.println("After --->stopping time  of execution");
		Date da=new Date();
		System.out.println(da);		
	}

	
	@DataProvider(name="testdata")
	public String[][] data() {
		String[][] ar= new String[2][2];
		ar[0][0]="aa";
		ar[0][1]="bb";
		ar[1][0]="cc";
		ar[1][1]="dd";
		return ar;
		
	}
	
	
	
	
	@Test(dataProvider="testdata")
	public void test1(String tdata,String tdatas) {
		//	Demo d=new Demo();
		System.out.println("Test1");
		//sendUserName(tdata);
		
		driver.findElement(By.id("email")).sendKeys(tdata);
		driver.findElement(By.id("pass")).sendKeys(tdatas);
	}
	
	
	
	
	//normal
//	@Test
//	public void test1() {
//		//	Demo d=new Demo();
//		System.out.println("Test1");
//		sendUserName("sugdudk");
//	}
	
	
	
	
//	@Test
//	public void apple() {
//		//	Demo d=new Demo();
//		System.out.println("Test1");
//		sendUserName("sugdudk");
//	}
	
	
	@Test(retryAnalyzer=TestNgAfaile.class)
	public void Apple() {
		//	Demo d=new Demo();
		System.out.println("Apple");
		int a=5/0;
		//sendUserName("sugdudk");
	}


}





