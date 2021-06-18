package framework.junit;


import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class JUni_WebDriver_Test 
{
	
	static String browser_driver_path="browser_drivers\\";
	static WebDriver driver;
	String url="https://www.facebook.com/";
	
	//This syntax helps to get current constucted test name
	public @Rule TestName test=new TestName();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", browser_driver_path+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@Before
	public void setUp() throws Exception 
	{
		driver.get(url);
	}

	@After
	public void tearDown() throws Exception 
	{
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.createDir(new File("screens"));
		FileHandler.copy(src, new File(test.getMethodName()+".png"));
	}
	
	@Test
	public void Verify_Signup_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Signup link title verified");
	
	}
	
	@Test
	public void Verify_Login_link()
	{
		driver.findElement(By.xpath("//a[@href='/login/']")).click();
		Assert.assertEquals("Log in to Facebook", driver.getTitle());
		System.out.println("Login link title verified");
	
	}
	

	@Test
	public void Verify_Messenger_link()
	{
		driver.findElement(By.xpath("//a[@href='https://messenger.com/']")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Messenger link title verified");
	
	}
	
	@Test
	public void Verify_Facebook_lite_link()
	{
		driver.findElement(By.xpath("//a[contains(.,'Facebook Lite')]")).click();
		Assert.assertEquals("Facebook Lite APK for Android", driver.getTitle());
		System.out.println("Facebook lite link title verified");
	
	}
	
	@Test
	public void Verify_watch_link()
	{
		driver.findElement(By.xpath("//a[@href='https://www.facebook.com/watch/']")).click();
		Assert.assertEquals("Facebook Watch", driver.getTitle());
		System.out.println("Facebook watch link title verified");
	
	}

	

}
