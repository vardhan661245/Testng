package Testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{   @BeforeSuite
	public void bfsuite()
	{
	System.out.println("@@@@This is before suite@@@@");
	}
	@BeforeTest
	public void bftest()
	{
	System.out.println("This is before test");
	}
	@BeforeClass()
	public void afclass()
	{
		System.out.println("This is before class");
	}
	@BeforeMethod
	public void bfmethod()
	{
		System.out.println("This is before method");
	}
	@Test
	public void Test1()
	{
		System.out.println("This is test 1");
	}
	@Test
	public void Test2()
	{
		System.out.println("This is test 2");
	}
	@AfterMethod
	public void afmethod()
	{
		System.out.println("This after method");
	}
	@AfterTest
	public void aftest()
	{
		System.out.println("This is after test");
	}
	@AfterClass()
	public void bfclass()
	{
		System.out.println("This is after class");
	}
	@AfterSuite
	public void afsuite()
	{
		System.out.println("**** this is after suite***");
	}
	
	
	

}
