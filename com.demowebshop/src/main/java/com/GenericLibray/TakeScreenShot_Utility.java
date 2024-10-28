
package com.GenericLibray;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.google.common.io.Files;
public class TakeScreenShot_Utility extends WebDriver_Utility
{
	/**
	 * 
	 * @throws IOException
	 */
  public static void takeErrorShot() throws IOException 
  {
	  	 ts=(TakesScreenshot) driver;
	  File source=ts.getScreenshotAs(OutputType.FILE);
	  
	  File destination=new File(Iconstant.ErrorShot_FilePath);
	  
	  Files.copy(source, destination);
  }
  /**
   * 
   * @param element
   * @throws IOException
   */
  public static void takeElementShot(WebElement element) throws IOException
  {
	  //String SystemDate = Java_Utility.date();
	  
	  File source = element.getScreenshotAs(OutputType.FILE);
	  
	  File destination = new File(Iconstant.ElementShot_FilePath);
	  
	  Files.copy(source, destination);
  }

}