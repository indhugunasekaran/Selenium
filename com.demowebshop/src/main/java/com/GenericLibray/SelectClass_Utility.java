package com.GenericLibray;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass_Utility
/**
 * 
 */
{
    Select select;
    public SelectClass_Utility(WebElement element)//constructor
     {
	   select=new Select(element);
     }
    /**
     * 
     * @param index
     */
	   public void Index(int index)
	   {
		  select.selectByIndex(index); 
	   }
	   /**
	    * 
	    * @param value
	    */
	   public void Value(String value) {
		   select.selectByValue(value);
	   }
	   /**
	    * 
	    * @param text
	    */
	   public void VisibleText(String text) {
		   select.selectByVisibleText(text);
	   }
	   /**
	    * 
	    * @param index
	    */
	   public void DeselectIndex(int index)
	   {
		   select.deselectByIndex(index);
	   }
	   /**
	    * 
	    * @param value
	    */
	   public void DeselectValue(String value)
	   {
		   select.deselectByValue(value);
	   }
	   /**
	    * 
	    * @param text
	    */
	   public void DeselectVisibleText(String text)
	   {
		   select.deselectByVisibleText(text);
	   }
	   /**
	    * 
	    * @return
	    */
	   public WebElement getFirstSelect() {
		  WebElement element = select.getFirstSelectedOption();
		  return element;
	   }
	   /**
	    * 
	    * @return
	    */
	   public List<WebElement> getAllSelect() {
		  List<WebElement> allElement = select.getAllSelectedOptions();
		  return allElement;
	   }
	   /**
	    * 
	    * @return
	    */
	   public List<WebElement> getAllOption()
	   {
		   List<WebElement> allOption = select.getOptions();
		   return allOption;
	   }
	   /**
	    * 
	    * @return
	    */
	   public int Size() 
	   {
		  int size = select.getOptions().size();
		  return size;
	   }
	   /**
	    * 
	    */
	   public void Clear()
	   {
		   select.deselectAll();
	   }
	   /**
	    * 
	    * @return
	    */
	   public boolean IsMultiSelect()
	   {
		  boolean b = select.isMultiple();
		  return b;
	   }
	   
	   public void DeselectAll()
	   {
		   
	   }
	   
}