package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class SignInPage extends BasePage{

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath = "//*[@id=\"userId-text-input-field\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"password-text-input-field\"]")
	public WebElement password;
	
	public void signInNewww(String userName, String passWord) {
		
		WebElement webElement = driver.findElement(By.xpath("//*[@id=\"logonbox\"]"));
		if (webElement.isDisplayed()) {
			driver.switchTo().frame("logonbox");

			username.sendKeys(userName);

			password.sendKeys(passWord);
		
		
	}
	}
	}
