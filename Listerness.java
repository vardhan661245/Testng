package Testng;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Listerness extends base
{
	@Test(retryAnalyzer=MyListenr2.class)
 	public void mytest1()
 	{  
 		driver=new ChromeDriver();
 		driver.get("https://www.facebook.com");
 		Assert.assertTrue(true);
 	}

}
