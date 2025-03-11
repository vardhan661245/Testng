package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class logintest 
{
	@Test
	void login()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		loginpage lg=new loginpage(driver);
		lg.username();
		lg.password();
		lg.login();
		Assert.assertEquals("...", "");
	}

}
