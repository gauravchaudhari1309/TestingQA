package pageobjload;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



public class LoginTestcase21 {
	
	//Signin_email_page emailpage;
	
	
	
	@Test
	public void Login() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe");		
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://money.rediff.com/index.html");
		
		Thread.sleep(2000);
		//**************************signin click **********************************
		Signin_page1 first= new Signin_page1(driver);
		PageFactory.initElements(driver, first);
		first.clickTerms();
		
		Thread.sleep(3000);
		
		//***************************sumbit details *******************************
		
		Submit_email_page1 signinpage=new Submit_email_page1(driver);
		
		PageFactory.initElements(driver, signinpage);
		
		signinpage.enteremailid("me.gaurav13@rediffmail.com");
		signinpage.enterpass("Gsc@1309");
		signinpage.clickNext();
	
		Thread.sleep(3000);
		
		//***********************create portfolio **********************************
		
		CreatePortfolio_Rediff portfolio = new CreatePortfolio_Rediff(driver);
		PageFactory.initElements(driver, portfolio);
		
		portfolio.elementClick();
		portfolio.elementClear();
		portfolio.elementAdd("Adding portfolio");
		portfolio.crtPfButton();
		
		Thread.sleep(3000);
		System.out.println("End");
		
		driver.quit();
	}

}
