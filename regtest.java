package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class regtest 
{
	@Test
	void register()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/register");
		regpage r=new regpage(driver);
		r.user();
		r.pass();
		r.cpass();
		r.reg();
	}

}
