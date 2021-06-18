package framework.Testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class Testng_WebDriver_Test 
{
	
  String driver_path="browser_drivers\\";
  WebDriver driver;
  String url="https://www.facebook.com/r.php";
  
  
  @Test
  public void Verify_SignUp_page()
  {
	  driver.findElement(By.xpath("//a[@title='Sign up for Facebook']")).click();
	  Assert.assertEquals(driver.getTitle(), "Sign up for Facebook | Facebook");
	  Reporter.log("Expected title presented for signup link  --> "+driver.getTitle());
  }
  
  
  @Test
  public void Verify_Login_Page()
  {
	  driver.findElement(By.xpath("//a[@href='/login/']")).click();
	  boolean flag=driver.getTitle().contains("Log in");
	  Assert.assertTrue(flag);
	  Reporter.log("Expected title presented for login link --> "+driver.getTitle());
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	 driver.get(url);
  }

  @AfterMethod
  public void afterMethod(Method method) throws Exception 
  {
	  /*
	   * Method is a class it get current constructed method name [@Test name]
	   */
	  File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.createDir(new File("screens"));
	  FileHandler.copy(src, new File(method.getName()+".png"));
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.chrome.driver", driver_path+"chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
