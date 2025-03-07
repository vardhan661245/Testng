package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class day3_1 
{
	@Test
	public void Test1()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		driver.findElement(By.id("username")).sendKeys("practice");
		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
		driver.findElement(By.xpath("//button[text()='Login']")).click();
		
		WebElement ele=driver.findElement(By.xpath("//div[@id='flash']/b"));
		String str=ele.getText();
		
		
		Assert.assertEquals(str,"You logged into a secure area!");
	}

}
