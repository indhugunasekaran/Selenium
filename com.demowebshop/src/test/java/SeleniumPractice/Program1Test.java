package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1Test {

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

}
