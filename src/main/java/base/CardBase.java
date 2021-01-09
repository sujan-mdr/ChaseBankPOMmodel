package base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CardBase {
	
	WebDriver driver;
	
	public CardBase(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
				
	}
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/div/div[2]/h1")
	public WebElement cardTitle;
	
	public String getCardTitle() {
		
		
		return cardTitle.getText();
	}
	
	@FindBy(xpath="//*[@id='ProductBenefits']/div/div[2]/h3")
	public List <WebElement> cardBenefitsRewards;
	
	
	public void readCardBenefitsRewards() {
		
		for (int i=0; i<cardBenefitsRewards.size(); i++) {
			
			System.out.println(cardBenefitsRewards.get(i).getText());
		}
		
	}
	
	@FindBy(xpath="//*[@id=\"leftPanel\"]/div/div[2]/div[3]/div/div/div[2]/a[1]")
	public WebElement offer;
	
	public void offerDetails() {
		
		offer.click();
	}

}
