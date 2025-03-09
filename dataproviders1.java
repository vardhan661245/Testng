package Testng;

import org.testng.annotations.Test;

public class dataproviders1 
{
	@Test(dataProvider="mydata",dataProviderClass=MyDataProviders.class)
 	public void test1(String user,String pass)
 	{
 		System.out.println("open chrome");
 	    System.out.println("go to login page");
 	    System.out.println("Enter usrername as "+user);
 	    System.out.println("Enter password as "+pass);
 	    System.out.println("Click on Login ");
 	    System.out.println("--------------------------------------");
 	}

}
