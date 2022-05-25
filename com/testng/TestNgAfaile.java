package com.testng;

import org.testng.IRetryAnalyzer;


import org.testng.ITestResult;

public class TestNgAfaile implements IRetryAnalyzer{

	
	int minretryCount=0;
	int maxretryCount=5;
	

	public boolean retry(ITestResult r) 
	{
		
		if(minretryCount<maxretryCount) {
			
			minretryCount ++;
			return true;	
		}
		return false;
		
}

	
	}

	

