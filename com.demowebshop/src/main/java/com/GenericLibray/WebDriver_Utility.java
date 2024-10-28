package com.GenericLibray;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriver_Utility
{
	/**
	 * 
	 */
   public static WebDriver driver;
   public static Properties pro;
   public static Workbook w;
   public static JavascriptExecutor js;
   public static TakesScreenshot ts;
   //public static Select select;
   public static Actions action;
   /**
    * 
    * @throws IOException
    */
   public static void navigateUrl() throws IOException
   {
	   driver.get(PropertyFile_Utility.propertyData("url"));
   }
   /**
    * 
    */
   public static void maximiseBrowser() {
	   driver.manage().window().maximize();
   }
   /**
    * 
    */
   public static void loadTime() {
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Iconstant.Implicit_Wait));
   }
   /**
    * 
    * @return
    */
   public static String currentUrl() {
	   driver.getCurrentUrl();
	   return currentUrl();
   }
   /**
    * 
    * @return
    */
   public static String title()
   {
	   driver.getTitle();
	   return title();
   }
   /**
    * 
    * @return
    */
   public static String pageSource()
   {
	   driver.getPageSource();
	   return pageSource();
   }
   /**
    * 
    * @return
    */
   public static String allwindowAddress()
   {
	   driver.getWindowHandle();
	   return allwindowAddress();
   }
   /**
    * 
    * @param url
    */
   public static void navigateTo(String url)
   {
	   driver.navigate().to(url);
   }
   /**
    * 
    */
   public static void moveBackward()
   {
	   driver.navigate().back();
   }
   /**
    * 
    */
   public static void moveForward()
   {
	   driver.navigate().back();
   }
   /**
    * 
    */
   public static void refreshPage()
   {
	   driver.navigate().refresh();
   }
  /**
   * 
   * @param message
   */
   public static void switchToPromptAlert(String message)
   {
	  Alert alt = driver.switchTo().alert();
	   alt.sendKeys(message);
   }
   /**
    * 
    * @param index
    */
   public static void switchToFrame(int index)
   {
	   driver.switchTo().frame(index);
   }
   /**
    * 
    * @param Attributevalue
    */
   public static void switchtoFrame(String Attributevalue)
   {
	 driver.switchTo().frame(Attributevalue);  
   }
   /**
    * 
    * @param element
    */
   public static void switchtoFrame(WebElement element)
   {
	   driver.switchTo().frame(element);
   }
   
   
}