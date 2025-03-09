package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependsonmethods 
{
	@Test
 	public void login()
 	{
 		System.out.println("This is login test");
 		Assert.assertTrue(true);
 	}
 	
 	@Test(dependsOnMethods="login")
 	public void logout()
 	{
 		System.out.println("This is logout test");
 		
 	}

}
