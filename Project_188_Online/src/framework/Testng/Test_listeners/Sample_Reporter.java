package framework.Testng.Test_listeners;

import java.util.List;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.xml.XmlSuite;

public class Sample_Reporter implements IReporter
{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory)
	{
		System.out.println("High level report created");
	
	}

}
