package com.GenericLibray;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScript_Executor extends WebDriver_Utility
{ 

		/**
		 * this method is used scrollUp the webpage
		 * @param xAxis
		 * @param yaxis
		 */
		public static void Scroll_Up(int xaxis,int yaxis)
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+xaxis+","+yaxis+")");
			
		}
		
	/**
	 * this method is used to scroll down the webpage
	 * @param xaxis
	 * @param yaxis
	 */
		public static void Scroll_Down(int xaxis,int yaxis)
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+xaxis+","+-yaxis+")");
		}
	/**
	 * this method is used to scrolltop to the webpage 
	 */
		public static void Scroll_TopWebPage()
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollTop)");
		}
		/**
		 * this method is used to scroll bottom of the webpage
		 */
		public static void Scroll_BottomWebPage()
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		}

		/**
		 * this method is used to scroll till the webelement
		 * @param element
		 */
		public static void Scroll_ToWebElement(WebElement element)
		{
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)",element);
		}
  }

