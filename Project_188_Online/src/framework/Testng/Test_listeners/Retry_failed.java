package framework.Testng.Test_listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_failed implements IRetryAnalyzer
{

	@Override
	public boolean retry(ITestResult result)
	{
		System.out.println("Re Executing test");
		return false;
	}

}
