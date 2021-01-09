package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "/html/body/div/div[6]/header/div[4]/div[1]/div/div")
	public WebElement openAccount;

	@FindBy(xpath = "/html/body/div/div[6]/header/div[4]/div[1]/div/div/div/div/div[1]/a")
	public WebElement creditCards;

	@FindBy(xpath = "/html/body/div/div[6]/header/div[4]/div[1]/div/div/div/div/div[2]/a/p[1]")
	public WebElement checkingAccounts;

	@FindBy(xpath = "//*[@id=\"userId-text-input-field\"]")
	public WebElement username;

	@FindBy(xpath = "//*[@id=\"password-text-input-field\"]")
	public WebElement password;

	@FindBy(xpath = "//*[@id=\"signin-button\"]")
	public WebElement logIn;
	
	@FindBy(xpath="//*[@id=\"signin-module\"]/div[2]/div/div/div/div[2]/a")
	public WebElement signIn;

	public CreditCardsPage gotoCreditCards() {

		// new Actions(driver).moveToElement(openAccount).perform();
		openAccount.click();
		creditCards.click();
		return new CreditCardsPage(driver);

	}

	public boolean Login(String userName, String passWord) {
		WebElement webElement = driver.findElement(By.xpath("//*[@id=\"logonbox\"]"));
		if (webElement.isDisplayed()) {
			driver.switchTo().frame("logonbox");

			username.sendKeys(userName);

			password.sendKeys(passWord);
			logIn.click();

		} else  {
			driver.findElement(By.xpath("//*[@id=\"signin-module\"]/div[2]/div/div/div/div[2]/a")).click();
			

		}
		return false;
		
		
	}
	
	public SignInPage signInNew() {
		
		signIn.click();
		return new SignInPage(driver);
		
	}

	public void gotoCheckingAccounts() {

		openAccount.click();
		checkingAccounts.click();

	}

}