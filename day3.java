package Testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day3 
{
	@Test
	public void Test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String act=driver.getTitle();
		
		String exp="Facebook – log in or sign up";
		 Assert.assertEquals(act, exp);
		 System.out.println("pass");
		
	}

}
