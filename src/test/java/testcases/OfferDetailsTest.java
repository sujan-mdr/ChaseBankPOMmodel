package testcases;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.BasePage;
import base.BaseTest;
import pages.HomePage;
import utilities.TestUtil;

public class OfferDetailsTest extends BaseTest {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void offerDetailsTest(String browserName, String runMode, String creditCardsName)
			throws InterruptedException {

		if (runMode.equals("N")) {

			throw new SkipException("Skipping the test as Run Mode is No");

		}

		setUp(browserName);

		if (creditCardsName.equals("freedomUnli")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectChaseFreedomUn();
			BasePage.credit.offerDetails();

		} else if (creditCardsName.equals("freedomFlex")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectChaseFreedomFlex();
			BasePage.credit.offerDetails();

		} else if (creditCardsName.equals("sapphire")) {

			HomePage home = new HomePage(driver);
			home.gotoCreditCards().selectChaseFreedomFlex();
			BasePage.credit.offerDetails();

		}
	}

}
