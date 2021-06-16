package pageFactory_Element_declarations;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Element_Declarations 
{
	
	//@Findby method look for object at webpage [This object only access using pagefactory class]
	@FindBy(name="firstname") WebElement Firstname_EB;
		
	//@FindBy also look for group of objects at webpage
	@FindBy(tagName="a") List<WebElement> page_links;
	 
	//@FindBy also look for group of objects at webpage
	@FindBy(tagName="select") List<WebElement> Dropdown;
	 
	//Finding list of options under drodpown
	@FindBy(css="select[id='month'] > option") List<WebElement> Month_options;
	 
	//Finding list of options under drodpown
	@FindBy(css="select[id='year'] > option") List<WebElement> year_options;
	 
	 
	 
	/*
	 * Once object is located and it will not be sarched over and over again
	 * 		[Mostly it is usefull in ajax web application]
	 * 	
	 * 		Note:--> Some times we get staleElementReference exception
	 */
	@FindBy(name="reg_passwd__") @CacheLookup WebElement Password_EB;
	 
	 
	
	
	 
	 
	 
	/*
	 * @FindBYS:
	 * When Required webelement objects need to match all of the given criteria..
	 */
	@FindBys
	({
		@FindBy(tagName="input"),			//Wrong tagname
		@FindBy(tagName="select"),
		@FindBy(className="_8esa"),
	}) List<WebElement> By_Group_Objects;
	
	
	 
	/*
	 * @FindAll:-->
	 *  When required webelement objects need to match atleast one of the give criteria
	 */
	
	@FindAll
	({
		@FindBy(tagName="select"),    		
		@FindBy(tagName="input"),			//wrong tagname
		@FindBy(className="_8esa "),
	}) List<WebElement> All_Group_objects;
	
	 
	 
	 
	 
	 /*
	  * Reusable method for month dropdown
	  */
	 public void select_month(String monthname)
	 {
		 for (WebElement Eachoption : Month_options) 
		 {
			String OptionName=Eachoption.getText();
			if(OptionName.equals(monthname))
			{
				Eachoption.click();
				break;
			}
			
		 }
	 }
	 
	 
	 
	 /*
	  * Reusable method for all dropdown options to select..
	  */
	 public void Select_month(List<WebElement> options_element,String Exp_optionname)
	 {
		 for (WebElement Eachoption : options_element) 
		 {
			 String OptionName=Eachoption.getText();
				if(OptionName.equals(Exp_optionname))
				{
					Eachoption.click();
					break;
				}
		 }
		
	 }
	 
	 

}
