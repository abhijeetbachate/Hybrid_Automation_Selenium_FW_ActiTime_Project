package com.testbase;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {

	public static WebDriver driver;
	public static boolean Test_fail;
	public static int tc=0;
	public static Logger l;
	
	public void OpenBrowser()
	{
		
		l = Logger.getLogger("devpinoyLogger");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
		driver = new ChromeDriver();
		
		driver.get("localhost:8080/login.do");
		l.info("URL is Entered");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	
	public void CloseBrowser()
	{
		driver.quit();
		l.info("Driver instance is killed");
	}
	
}
