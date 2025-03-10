package Testng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener extends base implements ITestListener
{
	
 	public void onTestSuccess(ITestResult result) {
 		 
 		System.out.println("##############Test got passed###########");
 	}
 
 	@Override
 	public void onTestFailure(ITestResult result) {
 		
 		System.out.println("##############Test got Failed###########");
 		
 	}
 
 	@Override
 	public void onStart(ITestContext context) {
 		
 		System.out.println("##############Test Started###########");
 	}

}
