package Testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Mysecondclass extends base
{
	@Test
	public void mytest1()
	{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	Assert.assertTrue(true);
	}

}
