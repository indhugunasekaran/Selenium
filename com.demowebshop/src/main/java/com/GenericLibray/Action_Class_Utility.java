package com.GenericLibray;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Action_Class_Utility extends WebDriver_Utility
{
  Actions action;
  
  public Action_Class_Utility(WebDriver driver)
  {
	  action=new Actions(driver);
  }
  
  public Action_Class_Utility moveCursor(WebElement element)
  {
	  action.moveToElement(element);
	  return this;
  }
  
  public Action_Class_Utility rightclick()
  {
	  action.contextClick();
	  return this;
  }
  
  public Action_Class_Utility rightclickElement(WebElement element)
  {
	  action.contextClick(element);
	  return this;
  }
  
  public Action_Class_Utility doubleClick(WebElement element)
  {
	  action.doubleClick(element);
	  return this;
  }
  
  public Action_Class_Utility pickandPut(WebElement source,WebElement destination)
  {
	  action.dragAndDrop(source, destination);
	  return this;
  }
  
  public void doAction()
  {
	  action.perform();
  }
}  