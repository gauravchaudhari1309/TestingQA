package pageobjload;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePortfolio_Rediff {
	WebDriver localdriver;
	public CreatePortfolio_Rediff(WebDriver driver) {
		this.localdriver = driver;
	}
	
	@FindBy(id ="createPortfolio")
	public WebElement creatPf;
	
	@FindBy(xpath = "//input[@id='create']")
	public WebElement clearpf;
	
	@FindBy(xpath="//input[@id='create']")
	public WebElement addpf;
	
	@FindBy(xpath = "//input[@id='createPortfolioButton']")
	public WebElement crtpfBtn;
	
	public void elementClick() {
		creatPf.click();
		System.out.println("Click to create Successfully");
	}
	
	
	public void elementClear() {
		clearpf.clear();
		System.out.println("clears element successfully");
	}
	
	public void elementAdd(String addPortfolio) {
		addpf.sendKeys(addPortfolio);
		System.out.println("Add Elemnet Successfully");
	}
	
	public void crtPfButton() {
		crtpfBtn.click();
		System.out.println("Click to Add Portfolio Successfully");
	}
	

}
