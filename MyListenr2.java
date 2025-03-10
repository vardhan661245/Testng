package Testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyListenr2  implements IRetryAnalyzer
{
	int maxTry=3;
 	int count=0;  
 	public boolean retry(ITestResult result) {
 		if(count<maxTry)
 		{
 			count++;
 			return true;
 		}
 		return false;
 	}

}
