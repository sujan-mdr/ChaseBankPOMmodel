package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public static WebDriver driver;
	public static CardBase credit;
	
	public BasePage(WebDriver driver) {
		
		BasePage.driver = driver;
		credit = new CardBase(driver);
		PageFactory.initElements(driver, this);
	}

}
