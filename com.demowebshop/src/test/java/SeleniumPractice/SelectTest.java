package SeleniumPractice;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.GenericLibray.Base_Class;
import com.GenericLibray.Select_Class_Utility;

public class SelectTest extends Base_Class{ 
@Test
public void testcase()
{
	
	  driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	  
	  Select_Class_Utility s=new Select_Class_Utility(driver.findElement(By.xpath("//select[@id='products-orderby']")));
	  
	    s.Index(2);
	   
	  //s.Value("https://demowebshop.tricentis.com/digital-downloads?orderby=0");
	  
	   // s.VisibleText("Name: Z to A");
	
	/**
	  s.DeselectIndex(2);
	  s.DeselectValue("https://demowebshop.tricentis.com/digital-downloads?orderby=0");
	  s.DeselectVisibleText("Name: Z to A");
	  
	  WebElement firstselectedoption = s.getFirstSelect();
	  s.getAllOption();
	  s.getAllSelect();
	  
	  s.Size();
	  s.Clear();
	*/  
	 boolean multipleSelect = s.IsMultiSelect();
	 
	 System.out.println(multipleSelect);
	 
  }
}