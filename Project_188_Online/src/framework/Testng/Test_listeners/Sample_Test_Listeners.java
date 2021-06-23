package framework.Testng.Test_listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Sample_Test_Listeners implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println("On Sucess Genarate Pass Report at Management Tooll");
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		
		System.out.println("On failure genarate Fail Report at defect tacking tool");
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Prepare to rerun your test on next regression cycle");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		System.out.println("Failed with success percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
