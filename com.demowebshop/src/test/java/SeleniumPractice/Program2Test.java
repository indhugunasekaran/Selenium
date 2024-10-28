package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Program2Test 
{
  @Test
  public void testcase()
  {
	  WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/digital-downloads");
  }
  @Test
  public void testcase1()
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.com");
  }
}
