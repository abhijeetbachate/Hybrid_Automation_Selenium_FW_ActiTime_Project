package com.testcases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

import com.testbase.TestBase;

public class OpenAndCloseBrowser extends TestBase{

	@BeforeSuite
	public void OpenBrowsertestcase() 
	{		
		OpenBrowser();
		
	}
	
	/*@AfterTest
	public void CloseBrowsertestcase()
	{
		CloseBrowser();
	}*/
}
