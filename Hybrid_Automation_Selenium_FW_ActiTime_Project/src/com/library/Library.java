package com.library;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.testbase.TestBase;

public class Library extends TestBase {

	
	public void logintestcase()
	{
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input")).sendKeys("admin");
		l.info("Username is Entered");
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
		l.info("Password is Entered");
		driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
		l.info("Clicked on Login Button");
	}
	
	public void createcustomerA() throws Throwable
	{
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")).click();;
		l.info("Cliced on Tasks");
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		l.info("Clicked on projects & Customers");
		driver.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		l.info("Clicked on Create Customers");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("CustomerA");
		l.info("Entered Customer Name");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[3]/textarea")).sendKeys("DescriptionA");
		l.info("Entered Description of CustomerA");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td/input[1]")).click();
		l.info("Clicked on Create Customer Button");
	}
	
	public void createcustomerB() throws Throwable
	{
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")).click();;
		l.info("Cliced on Tasks");
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		l.info("Clicked on projects & Customers");
		driver.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		l.info("Clicked on Create Customers");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("CustomerB");
		l.info("Entered Customer Name");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[3]/textarea")).sendKeys("DescriptionB");
		l.info("Entered Description of CustomerA");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td/input[1]")).click();
		l.info("Clicked on Create Customer Button");
	}
	public void createcustomerC() throws Throwable
	{
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")).click();;
		l.info("Cliced on Tasks");
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		l.info("Clicked on projects & Customers");
		driver.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		l.info("Clicked on Create Customers");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("CustomerC");
		l.info("Entered Customer Name");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[3]/textarea")).sendKeys("DescriptionC");
		l.info("Entered Description of CustomerA");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td/input[1]")).click();
		l.info("Clicked on Create Customer Button");
	}
	
	public void verifysuccessmessage() throws IOException
	{
		
			String st = driver.findElement(By.xpath(".//*[@id='SuccessMessages']/tbody/tr/td/span")).getText();
			l.info("The Text is captured");
			if (st.contains("successfully"))
			{    
				System.out.println("The Success message is displayed");
				l.info("The Success message is displayed on console");
				File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File(".\\src\\com\\screenShots\\ActiTime_Test "+(tc=tc+1)+" Pass.png"), true);
				l.info("Success ScreenShot is captured");
			}
			else
			{
				System.out.println("The Success message is NOT displayed");
				l.info("The Success message is NOT displayed on console");
				File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(srcFile, new File(".\\src\\com\\screenShots\\ActiTime_Test "+(tc=tc+1)+" Fail.png"), true);
				l.info("Failure ScreenShot is captured");
				driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td/input[2]")).click();
				l.info("Clicked on Cancel Button");
				
				Alert alert = driver.switchTo().alert();
				l.info("Driver reference switched on alert window");
				String str = alert.getText();
				l.info("The alert text is captured");
				System.out.println("The Alert is: "+str);
				l.info("The alert text is Displayed on Console");
				alert.accept();
				l.info("Accepted Alert Window");
			}
			
		}
	
	public void logout()
	{
		driver.findElement(By.xpath(".//*[@id='logoutLink']")).click();
		l.info("Clicked on Login Button");
	}
}
