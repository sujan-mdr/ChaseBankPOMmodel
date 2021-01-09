package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import base.BasePage;

public class CreditCardsPage extends BasePage {

	public CreditCardsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//*[@id=\"CategoryContainerWrap\"]/div[1]/div/div/div[4]/div[1]/div/div[3]/div[1]/a/img")
	public WebElement freedomUnli;

	@FindBy(xpath = "//*[@id=\"CategoryContainerWrap\"]/div[1]/div/div/div[4]/div[2]/div/div[3]/div[1]/a/img")
	public WebElement freedomFlex;

	@FindBy(xpath = "//*[@id=\"CategoryContainerWrap\"]/div[1]/div/div/div[4]/div[3]/div/div[3]/div[1]/a/img")
	public WebElement sapphire;

	@FindBy(xpath = "//*[@id=\"CategoryContainerWrap\"]/div[2]/div/div/div[4]/div[1]/div/div[3]/div[1]/a/img")
	public WebElement southwest;

	@FindBy(xpath = "//*[@id=\"CategoryContainerWrap\"]/div[2]")
	public WebElement travel;

	public ChaseFreedomUnPage selectChaseFreedomUn() {

		freedomUnli.click();

		return new ChaseFreedomUnPage(driver);
	}

	public ChaseFreedomFlexPage selectChaseFreedomFlex() {

		freedomFlex.click();
		return new ChaseFreedomFlexPage(driver);
	}

	public ChaseSapphirePage selectChaseSapphire() {

		sapphire.click();
		return new ChaseSapphirePage(driver);

	}

	public SouthwestRapidPage selectSouthwestRapid() {

		southwest.click();
		return new SouthwestRapidPage(driver);
	}

}
