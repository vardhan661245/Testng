package Testng;

import org.testng.annotations.Test;

public class class1 {

	@Test(invocationCount=2)
	public void Test1()
	{
		System.out.println("This is test 1");
	}
	@Test(enabled=false)
	public void Test2()
	{
		System.out.println("This is test 2");
	}
}
