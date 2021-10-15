package pageobjload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin_page1 {
	
	WebDriver localdriver;


	public Signin_page1(WebDriver driver)
	{
		this.localdriver = driver;
		
	}
	
	  @FindBy(linkText = "Sign In")
     	public WebElement signin;
     

	
	public void clickTerms() {
		signin.click();
	}
	
}
          
         