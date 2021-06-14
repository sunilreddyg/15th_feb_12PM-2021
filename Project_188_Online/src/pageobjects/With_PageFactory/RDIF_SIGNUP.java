package pageobjects.With_PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RDIF_SIGNUP 
{
	
	
	
	@FindBy(xpath="//a[@title='Create Rediffmail Account']") 
	public WebElement Create_account_page_link;
	
	
	@FindBy(css="input[name*='name']")
	public WebElement Fullname_TB;
	
	@FindBy(xpath="//input[contains(@name,'login')]")
	public WebElement Choose_A_rediffMail_TB;
	
	
	@FindBy(xpath="//input[@value='Check availability']")
	public WebElement Check_availability_BTN;
	
	@FindBy(xpath="//div[@id='check_availability']")
	public WebElement Check_Availability_TEXT;
	
	
	
	
	/*
	 * ReusableMethod:-->
	 * 		Check Email availability
	 */
	public void Check_Email_Availability(String fullname,String chooseemail)
	{
		Create_account_page_link.click();
		Fullname_TB.sendKeys(fullname);
		Choose_A_rediffMail_TB.sendKeys(chooseemail);
		Check_availability_BTN.click();
		String Info_text=Check_Availability_TEXT.getText();
		System.out.println(Info_text);
		
	}
	
	

}
