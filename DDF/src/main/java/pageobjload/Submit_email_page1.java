package pageobjload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Submit_email_page1 {
	WebDriver localdriver;
	public Submit_email_page1(WebDriver driver)
	{
		this.localdriver = driver;
	}

	
	
	@FindBy(xpath="//input[@id='useremail']")
	public WebElement email;
	
	@FindBy(xpath="//input[@id='userpass']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='loginsubmit']")
	public WebElement submit;
	
	
	
	
	
	public void enteremailid( String user) {
		email.sendKeys(user);
	}
	
	public void enterpass( String pass) {
		password.sendKeys(pass);
	}
	
	
	public void clickNext() {
		submit.click();
	}
				
	
}