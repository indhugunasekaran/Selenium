package com.GenericLibray;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;

@Listeners(Listner_Implement_Utility.class)
	public class Base_Class extends WebDriver_Utility
	{
		/**
		 * 
		 */
	  @BeforeSuite
	  
	  public void ConnectServer()
	  {
		  Reporter.log("Connected to server",true);
	  }
	   /**
	    * 
	    */
	  @BeforeTest
	  public void ConnectDataBase()
	  {
		  Reporter.log("Connected to Database",true);
	  }
	   /**
	    * 
	    * @throws IOException
	    */
	  @BeforeClass
	  public void OpenBrowser() throws IOException
	  {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();//maximiseBrowser
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds((Iconstant.Implicit_Wait)));  //loadTime();
	     // navigateTo(PropertyFile_Utility.propertyData("url"));
	      //driver.get(PropertyFile_Utility.propertyData("url1"));
		  driver.get(PropertyFile_Utility.propertyData("url"));
	  }
	  
	  /**
	 * @throws IOException 
	   * 
	   */
	  @BeforeMethod
	  public void login() throws IOException
	  {
		  driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		  driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(PropertyFile_Utility.propertyData("username"));
		  driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(PropertyFile_Utility.propertyData("password"));
		  driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		  
		  Reporter.log("Login done",true);
	  }
	  
	  /**
	   * 
	   */
	  @AfterMethod
	  public void logout()
	  {
		  Reporter.log("Logout done",true);
	  }
	  /**
	   * 
	   */
	  @AfterClass
	  public void CloseBrowser()
	  {
		  Reporter.log("Browser closed",true);
		  //driver.quit();
	  }
	  /**
	   * 
	   */
	  @AfterTest
	  public void Disconnectdatabase()
	  {
		  Reporter.log("Disconnect from Db",true);
	  }
	  /**
	   * 
	   */
	  @AfterSuite
	  public void DisconnectServer()
	  {
		  Reporter.log("Disconnect from Server",true);
	}
}
