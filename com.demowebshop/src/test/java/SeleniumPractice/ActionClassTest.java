package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.GenericLibray.Action_Class_Utility;
import com.GenericLibray.Base_Class;

public class ActionClassTest extends Base_Class{
@Test
public void test()
{
	Action_Class_Utility  a=new Action_Class_Utility(driver);
	WebElement element=driver.findElement(By.xpath("//a[contains(text(),'Computers')]");
}
	
}

