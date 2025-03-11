package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage 
{
	@FindBy(xpath="//input[@name='username']") WebElement username;
	@FindBy(xpath="//input[@id='password']") WebElement password;
	@FindBy(xpath="//button[text()='Login']") WebElement login;
	
	void username()
	{
		username.sendKeys("practice");;
	}
    void password()
    {
    	password.sendKeys("SuperSecretPassword!");
    }
    void login()
    {
    	login.click();
    }
    
    loginpage(WebDriver d)
    {
    	PageFactory.initElements(d, this);
    }
}
