package com.testcases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.library.Library;
import com.testbase.TestBase;

public class TestCases extends TestBase{

	/*@Test(priority=1)
	public void createcustomerAtestcase() throws Throwable
	{
		logintestcase();
		l.info("The Login TestCase Executed");
		createcustomerA();
		l.info("Customer A is Created Successfully");
		verifysuccessmessage();
		l.info("Success Message is Verified");
		logout();
		l.info("The Logout TestCase Executed");
		l.info("================Test Case 1 Executed====================");
	}
	
	@Test(priority=2)
	public void createcustomerBtestcase() throws Throwable
	{
		logintestcase();
		l.info("The Login TestCase Executed");
		createcustomerB();
		l.info("Customer B is Created Successfully");
		verifysuccessmessage();
		l.info("Success Message is Verified");
		logout();
		l.info("The Logout TestCase Executed");
		l.info("================Test Case 2 Executed====================");
	}
	
	@Test(priority=3)
	public void createcustomerCtestcase() throws Throwable
	{
		logintestcase();
		l.info("The Login TestCase Executed");
		createcustomerC();
		l.info("Customer C is Created Successfully");
		verifysuccessmessage();
		l.info("Success Message is Verified");
		logout();
		l.info("The Logout TestCase Executed");
		l.info("================Test Case 3 Executed====================");
	}
	*/
	
	@Test
	public void loginTC()
	{
		//driver.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
		l.info("Username is Entered");
		driver.findElement(By.xpath("//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
		l.info("Password is Entered");
		driver.findElement(By.xpath("//*[@id='loginButton']")).click();
		l.info("Clicked on Login Button");
	}
	
}
