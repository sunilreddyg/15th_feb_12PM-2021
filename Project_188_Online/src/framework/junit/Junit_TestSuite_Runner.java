package framework.junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({MyJuniTest.class,Junit_All_Annotations.class,Ignore_Method.class})
public class Junit_TestSuite_Runner 
{
	
}
