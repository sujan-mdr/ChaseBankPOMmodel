package testcases;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import utilities.TestUtil;

public class GotoCreditCardsTest extends BaseTest {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void findCreditCardTest(String browserName, String runMode, String creditCardsName, String cardTitle)
			throws InterruptedException {

		if (runMode.equals("N")) {

			throw new SkipException("Skinning the test as RunMode Is NO");
		}

		setUp(browserName);

		if (creditCardsName.equals("freedomUnli")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectChaseFreedomUn();
			Assert.assertEquals(BasePage.credit.getCardTitle(), cardTitle);
			System.out.println(BasePage.credit.getCardTitle());

		} else if (creditCardsName.equals("freedomFlex")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectChaseFreedomFlex();
			Assert.assertEquals(BasePage.credit.getCardTitle(), cardTitle);
			System.out.println(BasePage.credit.getCardTitle());

		} else if (creditCardsName.equals("sapphire")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectChaseSapphire();
			Assert.assertEquals(BasePage.credit.getCardTitle(), cardTitle);
			System.out.println(BasePage.credit.getCardTitle());

		} else if (creditCardsName.equals("southwest")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectSouthwestRapid();
			Assert.assertEquals(BasePage.credit.getCardTitle(), cardTitle);
			System.out.println(BasePage.credit.getCardTitle());
		}

	}

}
