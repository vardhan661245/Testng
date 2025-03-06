package Testng;

import org.testng.annotations.Test;

public class class2 {
	@Test(groups="smoke")
	public void test1()
	{
		System.out.println("Smoke this is test 1 in Class 2");
	}
	
	
	@Test(groups="reg" )
	public void test2()
	{
		System.out.println("Regression this is test 2 in Class 2");
	
	}
	
	
	@Test(groups="wip")
	public void test3()
	{
		System.out.println("Wip this is test 1 in Class 2");
	}
	

	@Test(groups="reg")
	public void test4()
	{
		System.out.println("Regression this is test 2 in Class 2");
	}
	

}
