package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class regpage 
{
	@FindBy(xpath="//input[@name='username']") WebElement user;
	@FindBy(xpath="//input[@name='password']") WebElement pass;
	@FindBy(xpath="//input[@id='confirmPassword']") WebElement cpass;
	@FindBy(xpath="//button[text()='Register']") WebElement reg;
	
	void user()
	{
		user.sendKeys("vishnu");	
	}
	void pass()
	{
		pass.sendKeys("vishnu");
	}
	void cpass()
	{
		cpass.sendKeys("vishnu");
	}
	void reg()
	{
		reg.click();
	}
	regpage(WebDriver d1)
	{
		PageFactory.initElements(d1, this);
	}
	

}
